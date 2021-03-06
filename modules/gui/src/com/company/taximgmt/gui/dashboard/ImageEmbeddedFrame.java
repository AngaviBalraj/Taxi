package com.company.taximgmt.gui.dashboard;

import com.haulmont.cuba.core.app.FileStorageService;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.global.ClientType;
import com.haulmont.cuba.core.global.FileStorageException;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.AppConfig;
import com.haulmont.cuba.gui.components.AbstractFrame;
import com.haulmont.cuba.gui.components.Embedded;

import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

public class ImageEmbeddedFrame extends AbstractFrame {

    @Inject
    private Embedded imageFromFileStorage;
    @Inject
    private Embedded image;
    @Inject
    private FileStorageService fileStorageService;
    @Inject
    private Metadata metadata;
    public static final String IMAGE_PATH = "F:\\taxi_management_cuba\\modules\\gui\\src\\com\\company\\taximgmt\\gui\\dashboard//image.png";
    public static final String IMAGE_NAME = "image.jpg";
    @Override
    public void init(Map<String, Object> params) {
        loadImageFromFileStorage();

        if (AppConfig.getClientType() == ClientType.WEB) {
            image.setSource("image.jpg");
        }
    }

    private void loadImageFromFileStorage() {
        // A file descriptor entity is usually stored in the database and referenced by an attribute of your data
        // model entity. Here we simply create it for the purpose of the example.
        FileDescriptor imageFile = metadata.create(FileDescriptor.class);
        imageFile.setId(UUID.fromString("61a6a1ee-f13a-f44f-0201-c2f9b3288305"));
        imageFile.setName("image.jpg");
        imageFile.setCreateDate(new Date(1427857200503L));
        imageFile.setExtension("jpg");

        byte[] bytes = null;
        try {
            bytes = fileStorageService.loadFile(imageFile);
        } catch (FileStorageException e) {
            showNotification("Unable to load image file", NotificationType.HUMANIZED);
        }
        if (bytes != null) {
            imageFromFileStorage.setSource(imageFile.getName(), new ByteArrayInputStream(bytes));
            imageFromFileStorage.setType(Embedded.Type.IMAGE);
        } else {
            imageFromFileStorage.setVisible(false);
        }
    }
}