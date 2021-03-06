/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Classes.UploadData;
import Classes.Validation;
import java.io.File;

/**
 *
 * @author afannin1
 */
public class UploadModel {

    private String pushInterval;
    Validation validate = new Validation();
    
    public void setPushInterval(String interval) {
        pushInterval = interval;
    }
    
    public String getPushInterval() {
        return pushInterval;
    }
    
    public boolean validateText(String text) {
        return validate.stringTextField(text);
    }
    
    public boolean validateInt(String text) {
        return validate.integerTextField(text);
    }

    public void uploadData(final File file, final String apiKey, final String projectKey, final int templateId, final int startLine) {
        UploadData push = new UploadData(file, templateId, startLine, apiKey, projectKey);
        push.uploadLoggerData();
    }
}
