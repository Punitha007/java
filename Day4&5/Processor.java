class Computer {

private String brand = "Dell";

private String model = "XPS 15";

class Processor {

private String processorType = "Intel";

public void show() {

System.out.println("Processor Type: + processorType);

System.out.println("Computer Brand: + brand);

System.out.println("Computer Model: + model);

}

}

public void display() {

class LocalProcessor {

private String processorType = "AMD ";

public void showInfo() {

System.out.println("Local Processor Type: + processorType);

}

}

LocalProcessor 1p = new LocalProcessor();

lp.showInfo();

}
