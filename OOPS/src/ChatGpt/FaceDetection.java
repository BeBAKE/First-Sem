package ChatGpt;
//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.core.MatOfRect;
//import org.opencv.core.Point;
//import org.opencv.core.Rect;
//import org.opencv.core.Scalar;
//import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.imgproc.Imgproc;
//import org.opencv.objdetect.CascadeClassifier;
//
//public class FaceDetection {
//    public static void main(String[] args) {
//        // Load the OpenCV library
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//
//        // Load the input image
//        Mat image = Imgcodecs.imread("input.jpg");
//
//        // Load the classifier file
//        CascadeClassifier faceDetector = new CascadeClassifier("haarcascade_frontalface_default.xml");
//
//        // Detect faces in the image
//        MatOfRect faceDetections = new MatOfRect();
//        faceDetector.detectMultiScale(image, faceDetections);
//
//        // Draw a bounding box around each face
//        for (Rect rect : faceDetections.toArray()) {
//            Imgproc.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 0, 255));
//        }
//
//        // Save the output image
//        Imgcodecs.imwrite("output.jpg", image);
//    }
//}
