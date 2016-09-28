package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.StorageFile.StorageOperationException;

public interface Storage {
    
    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage file.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }
    
    /**
     * Saves all data to this storage file.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to file.
     * @throws seedu.addressbook.storage.StorageFile.StorageOperationException 
     */
    public void save(AddressBook addressBook) throws StorageOperationException, seedu.addressbook.storage.StorageFile.StorageOperationException;
    
    /**
     * Loads data from this storage file.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data from file.
     * @throws seedu.addressbook.storage.StorageFile.StorageOperationException 
     */
    public AddressBook load() throws StorageOperationException, seedu.addressbook.storage.StorageFile.StorageOperationException;
    
    /**
     * returns path name as a string
     * 
     */
    public String getPath();

}
