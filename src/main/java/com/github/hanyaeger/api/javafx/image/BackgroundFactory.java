package com.github.hanyaeger.api.javafx.image;

import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 * A {@link BackgroundFactory} can be used to create instances of {@link javafx.scene.layout.Background}
 * to be used as the background of a {@link Pane}. This can be either an image based background, or a backrgound
 * that only contains a fill color.
 */
public class BackgroundFactory {

    /**
     * Create a {@link Background} with the specified fill {@link Color}.
     *
     * @param color The {@link Color} to be used.
     * @return A {@link Background} that encapsulates an {@link BackgroundFill} with the given {@link Color}.
     */
    public Background createFillBackground(final Color color) {
        return new Background(new BackgroundFill(color, null, null));
    }

    /**
     * Create a {@link Background} with the specified image.
     *
     * @param image The {@link Image} to be used.
     * @return A {@link Background} that encapsulates an {@link BackgroundImage} with the given {@link Image}.
     */
    public Background createImageBackground(final Image image) {
        return new Background(new BackgroundImage(image, null, null, null, null));
    }
}
