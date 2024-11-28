public class ServiceStation {
    public void check(Transport transport) {
        switch (transport) {
            case Car car -> {
                System.out.println("Обслуживаем " + car.getModelName());
                for (int i = 0; i < car.getWheelsCount(); i++) {
                    car.updateTyre();
                }
                car.checkEngine();
            }
            case Truck truck -> {
                System.out.println("Обслуживаем " + truck.getModelName());
                for (int i = 0; i < truck.getWheelsCount(); i++) {
                    truck.updateTyre();
                }
                truck.checkEngine();
                truck.checkTrailer();
            }
            case Bicycle bicycle -> {
                System.out.println("Обслуживаем " + bicycle.getModelName());
                for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                    bicycle.updateTyre();
                }
            }
            case null, default ->
                    System.out.println("Неизвестный тип транспорта: " + transport.getClass().getSimpleName());
        }
    }
}
