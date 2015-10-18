package pl.postrowski.probablycoolmusicdownloader;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

public class SamplePart {

    @Inject
    private IEclipseContext context;

    @PostConstruct
    public void initialize(BorderPane borderPane) {
        borderPane.setCenter(new Label("This is a Java FX control"));

        final Button btnDownload = new Button();
        borderPane.setTop(btnDownload);
        btnDownload.setText("Download");
        btnDownload.setOnAction(this::downloadButtonEventHandler);
    }

    private void downloadButtonEventHandler(ActionEvent event)
    {
        final WebContentParser webContentParser = new WebContentParser();

        webContentParser.getPageBody(ShazamPageConsumer.URL, new ShazamPageConsumer());
    }

}
