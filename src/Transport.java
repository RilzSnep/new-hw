public abstract class Transport {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    // Общий метод для обслуживания шин
    public void serviceTyres() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    public abstract void check(); // Абстрактный метод для проверки транспорта
}
