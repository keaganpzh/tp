package wedlog.address.ui;

import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Region;
import wedlog.address.commons.core.LogsCenter;
import wedlog.address.logic.Logic;

/**
 * A UI component that displays statistics of WedLog.
 * To be updated in the future.
 */
public class StatisticsPanel extends UiPart<Region> {

    private static final String FXML = "StatisticsPanel.fxml";
    private final Logger logger = LogsCenter.getLogger(StatisticsPanel.class);
    private final Logic logic;

    @FXML
    private Label guestsTrackedLabel;
    @FXML
    private Label vendorsTrackedLabel;
    @FXML
    private Label listTitle;
    @FXML
    private ListView<String> dietaryListView;

    /**
     * Creates a {@code StatisticsPanel}
     * Currently, this is a blank component.
     */
    public StatisticsPanel(Logic logic) {
        super(FXML);
        this.logic = logic;
        guestsTrackedLabel.setText("Guests: " + logic.getFilteredGuestList().size());
        vendorsTrackedLabel.setText("Vendors: " + logic.getFilteredVendorList().size());
    }

}
