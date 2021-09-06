package by.academy.jc.device;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeviceStockTest {

    @Test
    void shouldDisplayAllDevices() {
        DeviceStock stock = new DeviceStock();

        TV sony = new TV("Sony", 1200.);
        TV lg = new TV("LG", 200.);

        stock.add(sony);
        stock.add(lg);

        Collection<Device> allDevices = stock.findAll();
        assertTrue(allDevices.contains(sony));
        assertTrue(allDevices.contains(lg));

        for (Device device : allDevices) {
            System.out.println(device);
        }
    }

    @Test
    void shouldReturnId() {
        DeviceStock stock = new DeviceStock();

        TV first = new TV("First", 100.);
        TV second = new TV ("Second", 2000.);
        TV third = new TV("Third", 3000.);

        stock.add(first);
        stock.add(second);
        stock.add(third);

        Device result = stock.findById(second.getId());
        System.out.println(result);

        assertEquals(second, result);
    }
}