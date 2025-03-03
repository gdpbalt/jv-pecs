package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<T extends Machine> {
    /**
     * @return - the list of models
     */
    List<T> get();
}
