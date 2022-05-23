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


        //    public void check(Car car, Bicycle bicycle, Truck truck) {
//        if (car != null) {
//            System.out.println("Обслуживаем " + car.modelName);
//            for (int i = 0; i < car.wheelsCount; i++) {
//                car.updateTyre();
//            }
//            car.checkEngine();
//        } else if (truck != null) {
//            System.out.println("Обслуживаем " + truck.modelName);
//            for (int i = 0; i < truck.wheelsCount; i++) {
//                truck.updateTyre();
//            }
//            truck.checkEngine();
//            truck.checkTrailer();
//        } else if (bicycle != null) {
//            System.out.println("Обслуживаем " + bicycle.modelName);
//            for (int i = 0; i < bicycle.wheelsCount; i++) {
//                bicycle.updateTyre();
//            }
//        }
//    }



}
