package test;


import main.Storage;
import org.junit.Assert;
import org.junit.Test;

class StorageTest {

    Storage storage= Storage.getInstance();

    @Test
    public void singletonBehaviourTest() {
        Assert.assertEquals(storage, Storage.getInstance());
    }

}