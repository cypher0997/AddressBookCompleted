package addressBook.utility.read_writeFacility;

import java.util.List;
import java.util.Map;

import addressBook.ContactDetails;

public interface Writeable {
    void writeTxtFile(Map<String, List<ContactDetails>> take);
    void writeCsvFile(Map<String, List<ContactDetails>> take);
}
