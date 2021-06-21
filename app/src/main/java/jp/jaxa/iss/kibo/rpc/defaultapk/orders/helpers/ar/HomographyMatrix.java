package jp.jaxa.iss.kibo.rpc.defaultapk.orders.helpers.ar;

import org.opencv.core.Mat;

public class HomographyMatrix {

    // Change these out of mat form?
    private final Mat rotationVector;
    private final Mat translationVector;


    HomographyMatrix(Mat rotationVector, Mat translationVector) {
        this.rotationVector = rotationVector;
        this.translationVector = translationVector;
    }

    public Mat getRotationVector() {
        return this.rotationVector;
    }

    public Mat getTranslationVector() {
        return this.translationVector;
    }
}