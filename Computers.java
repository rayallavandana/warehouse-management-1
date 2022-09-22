package rit.sse.ptp;

public class Computers {
    private String brandName;
    private String modelName;
    private int hardDriveCapacity;
    private int memory;
    private float cpuSpeed;
    private float price;

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String Brandname) {
        this.brandName = Brandname;
    }

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String Modelname) {
        this.modelName = Modelname;
    }

    public int getHardDeriveCapacity() {
        return this.hardDriveCapacity;
    }

    public void setHardDriveCapacity(int HardDirveCapacity) {
        this.hardDriveCapacity = HardDirveCapacity;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int Memory) {
        this.memory = Memory;
    }

    public float getCpuSpeed() {
        return this.cpuSpeed;
    }

    public void setCpuSpeed(float CpuSpeed) {
        this.cpuSpeed = CpuSpeed;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float Price) {
        this.price = Price;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", hardDriveCapacity=" + hardDriveCapacity +
                ", memory=" + memory +
                ", cpuSpeed=" + cpuSpeed +
                ", price=" + price +
                '}';
    }
}

