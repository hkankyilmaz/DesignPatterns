package edu.sabanciuniv.Builder;

public class Computer {
    private static BaseComputerBuilder baseComputerBuilder;
    private static ComputerDisplayBuilder computerDisplayBuilder;
    private static AccessoryBuilder accessoryBuilder;

    private String name;
    private CPU cpu;
    private RAM ram;
    private HardDrive hd;
    private GraphicCard graphicCard;
    private Display display;
    private Keyboard keyboard;
    private Mouse mouse;

    private Computer() {
    }

    private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard) {
        super();
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
    }

    private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display) {
        super();
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
        this.display = display;
    }

    private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display,
                     Keyboard keyboard) {
        super();
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
        this.display = display;
        this.keyboard = keyboard;
    }

    private Computer(String name, CPU cpu, RAM ram, HardDrive hd, GraphicCard graphicCard, Display display,
                     Keyboard keyboard, Mouse mouse) {
        super();
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.hd = hd;
        this.graphicCard = graphicCard;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public void start() {
        cpu.start();
        ram.loadOSKernelImage();
        ram.loadOS();
        ram.loadDrivers();
        ram.startServices();
        hd.start();
        if (graphicCard != null)
            graphicCard.start();
        if (display != null)
            display.start();
        if (keyboard != null)
            keyboard.start();
        if (mouse != null)
            mouse.start();
        System.out.println("Computer " + name + " has started.\n");
    }

    public String getName() {
        return name;
    }

    public CPU getCpu() {
        return cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public HardDrive getHd() {
        return hd;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public static BaseComputerBuilderI getBaseBuilder(String name) {
        baseComputerBuilder = new BaseComputerBuilder(name);
        return baseComputerBuilder;
    }

    private static ComputerDisplayBuilderI getDisplayBuilder() {
        computerDisplayBuilder = new ComputerDisplayBuilder(baseComputerBuilder);
        return computerDisplayBuilder;
    }

    private static AccessoryBuilderI getAccessoryBuilder() {
        accessoryBuilder = new AccessoryBuilder(computerDisplayBuilder);
        return accessoryBuilder;
    }

    public static class BaseComputerBuilder implements BaseComputerBuilderI {
        private String name;

        private boolean hasRam;
        private boolean hasCPU;
        private boolean hasHD;

        private Computer computer;

        public BaseComputerBuilder(String name) {
            this.name = name;
        }

        @Override
        public BaseComputerBuilderI buildRAM() {
            hasRam = true;
            return this;
        }

        @Override
        public BaseComputerBuilderI buildCPU() {
            hasCPU = true;
            return this;
        }

        @Override
        public BaseComputerBuilderI buildHardDrive() {
            hasHD = true;
            return this;
        }

        @Override
        public ComputerDisplayBuilderI buildBaseComputer() {
            computer = new Computer();
            computer.name = name;

            if (hasRam) {
                RAM ram = new RAM();
                computer.ram = ram;
            }

            if (hasCPU) {
                CPU cpu = new CPU();
                computer.cpu = cpu;
            }

            if (hasHD) {
                HardDrive hd = new HardDrive();
                computer.hd = hd;
            }
            ComputerDisplayBuilder computerDisplayBuilder = (ComputerDisplayBuilder) getDisplayBuilder();
            computerDisplayBuilder.computer = computer;
            return computerDisplayBuilder;
        }
    }

    public static class ComputerDisplayBuilder implements ComputerDisplayBuilderI {

        private boolean hasGC;
        private boolean hasDisplay;

        private Computer computer;

        public ComputerDisplayBuilder(BaseComputerBuilder baseComputerBuilder) {
            computer = baseComputerBuilder.computer;
        }

        @Override
        public ComputerDisplayBuilderI buildGraphicCard() {
            hasGC = true;
            return this;
        }

        @Override
        public ComputerDisplayBuilderI buildDisplay() {
            hasDisplay = true;
            return this;
        }

        @Override
        public AccessoryBuilderI buildComputerDisplay() {

            if (hasGC) {
                GraphicCard graphicCard = new GraphicCard();
                computer.graphicCard = graphicCard;
            }

            if (hasDisplay) {
                Display display = new Display();
                computer.display = display;
            }

            AccessoryBuilder accessoryBuilder = (AccessoryBuilder) getAccessoryBuilder();
            accessoryBuilder.computer = computer;
            return accessoryBuilder;
        }
    }

    public static class AccessoryBuilder implements AccessoryBuilderI {

        private boolean hasMouse;
        private boolean hasKeyboard;

        private Computer computer;

        public AccessoryBuilder(ComputerDisplayBuilder computerDisplayBuilder) {
            computer = computerDisplayBuilder.computer;
        }

        @Override
        public AccessoryBuilderI buildMouse() {
            hasMouse = true;
            return this;
        }

        @Override
        public AccessoryBuilderI buildKeyboard() {
            hasKeyboard = true;
            return this;
        }

        @Override
        public Computer build() {

            if (hasMouse) {
                Mouse mouse = new Mouse();
                computer.mouse = mouse;
            }

            if (hasKeyboard) {
                Keyboard keyboard = new Keyboard();
                computer.keyboard = keyboard;
            }
            return computer;
        }
    }
}

