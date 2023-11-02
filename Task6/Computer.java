package Study_Java.Task6;

public class Computer {
    private OriginOfPC originOfPC;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(OriginOfPC originOfPC, Processor processor, Memory memory, Monitor monitor){
        this.originOfPC = originOfPC;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public OriginOfPC getOriginOfPC(){
        return originOfPC;
    }
    public Processor getProcessor(){
        return processor;
    }
    public Memory getMemory(){
        return memory;
    }
    public Monitor getMonitor(){
        return monitor;
    }
}