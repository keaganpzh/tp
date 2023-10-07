package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.person.Address;
import seedu.address.model.person.DietaryRequirements;
import seedu.address.model.person.Email;
import seedu.address.model.person.Guest;
import seedu.address.model.person.Name;
import seedu.address.model.person.Phone;
import seedu.address.model.person.RsvpStatus;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Guest objects.
 */
public class GuestBuilder {

    public static final String DEFAULT_NAME = "Amy Gee";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_EMAIL = "amy@gmail.com";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";
    public static final String DEFAULT_RSVP_STATUS = "yes";
    public static final String DEFAULT_DIETARY_REQUIREMENTS = "vegan";

    private Name name;
    private Phone phone;
    private Email email;
    private Address address;
    private RsvpStatus rsvpStatus;
    private DietaryRequirements dietaryRequirements;
    private Set<Tag> tags;

    /**
     * Creates a {@code GuestBuilder} with the default details.
     */
    public GuestBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
        address = new Address(DEFAULT_ADDRESS);
        rsvpStatus = new RsvpStatus(DEFAULT_RSVP_STATUS);
        dietaryRequirements = new DietaryRequirements(DEFAULT_DIETARY_REQUIREMENTS);
        tags = new HashSet<>();
    }

    /**
     * Initializes the GuestBuilder with the data of {@code personToCopy}.
     */
    public GuestBuilder(Guest guestToCopy) {
        name = guestToCopy.getName();
        phone = guestToCopy.getPhone();
        email = guestToCopy.getEmail();
        address = guestToCopy.getAddress();
        rsvpStatus = guestToCopy.getRsvpStatus();
        dietaryRequirements = guestToCopy.getDietaryRequirements();
        tags = new HashSet<>(guestToCopy.getTags());
    }

    /**
     * Sets the {@code Name} of the {@code Guest} that we are building.
     */
    public GuestBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Guest} that we are building.
     */
    public GuestBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Guest} that we are building.
     */
    public GuestBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Guest} that we are building.
     */
    public GuestBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Guest} that we are building.
     */
    public GuestBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    /**
     * Sets the {@code RsvpStatus} of the {@code Guest} that we are building.
     */
    public GuestBuilder withRsvpStatus(String rsvpStatus) {
        this.rsvpStatus = new RsvpStatus(rsvpStatus);
        return this;
    }

    /**
     * Sets the {@code DietaryRequirements} of the {@code Guest} that we are building.
     */
    public GuestBuilder withDietaryRequirements(String dietaryRequirements) {
        this.dietaryRequirements = new DietaryRequirements(dietaryRequirements);
        return this;
    }

    public Guest build() {
        return new Guest(name, phone, email, address, rsvpStatus, dietaryRequirements, tags);
    }

}
