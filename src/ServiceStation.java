public class ServiceStation implements Service {
    @Override
    public void transportService(Car car) {
        wheelsService(car);
        engineCheck(car);
    }
    @Override
    public void transportService(Bicycle bicycle) {
        wheelsService(bicycle);

    }
    @Override
    public void transportService(Truck truck) {
        wheelsService(truck);
        engineCheck(truck);
        truck.checkTrailer();
    }
    private void wheelsService(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.getModelName());
            for (int i = 0; i < transport.getWheelsCount(); i++) {
                transport.updateTyre();
            }
        }
    }
    private void engineCheck(Transport transport) {
        if (transport != null) {
            transport.checkEngine();
        }
    }

}
