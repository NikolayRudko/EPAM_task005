package com.epam.task.five.data.factory;

import com.epam.task.five.data.ConsoleDataAcquirer;
import com.epam.task.five.data.DataAcquirer;

public class ConsoleInputFactory implements InputFactory {
    @Override
    public DataAcquirer createDataAcquirer() {
        return new ConsoleDataAcquirer();
    }
}
