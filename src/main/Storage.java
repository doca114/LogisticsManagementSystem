package main;

import java.util.UUID;

public class Storage {
    private String storageName;
    private UUID storageID;
    private String ownerName;
    private String location;
    private static Storage storage= new Storage("Dorcycle Kft.", UUID.randomUUID(), "Molnár Dóra", "Dorcity");

    public String getStorageName() {
        return storageName;
    }

    public UUID getStorageId() {
        return storageID;
    }

    public String getOwnerName(){ return ownerName; }

    public String getLocation() {
        return location;
    }

    public Storage(String storageName, UUID storageId, String ownerName, String location) {
        this.storageName = storageName;
        this.storageID = storageId;
        this.ownerName = ownerName;
        this.location = location;
    }

    public static Storage getInstance(){
        return storage;
    }

}
