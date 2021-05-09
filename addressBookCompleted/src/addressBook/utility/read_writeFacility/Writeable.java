package addressBook.utility.read_writeFacility;

import java.util.List;
import java.util.Map;

import addressBook.ContactDetails;

public interface Writeable {
    void writeFile(Map<Integer, List<ContactDetails>> take);
}
