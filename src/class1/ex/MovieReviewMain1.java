package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        MovieReview movieReview2 = new MovieReview();
        MovieReview[] movieReviews = {movieReview1, movieReview2};

        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목 : " + movieReview.title + ", 리뷰 : " + movieReview.review);
        }
    }
}
