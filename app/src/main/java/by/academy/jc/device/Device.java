package by.academy.jc.device;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import java.util.UUID;

public class Device {
    private final String id;

    protected Device(){
        id= UUID.randomUUID().toString().substring(0, 5);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equal(id, device.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .toString();
    }
}
