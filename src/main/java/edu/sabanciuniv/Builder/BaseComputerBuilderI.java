package edu.sabanciuniv.Builder;

public interface BaseComputerBuilderI {

    public BaseComputerBuilderI buildRAM();

    public BaseComputerBuilderI buildCPU();

    public BaseComputerBuilderI buildHardDrive();

    public ComputerDisplayBuilderI buildBaseComputer();
}
