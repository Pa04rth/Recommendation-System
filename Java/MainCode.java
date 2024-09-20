public class MainCode {
    public static void main(String[] args) {
        // instance of Recommendation system is created
        RecommendationSystem recommendationSystem = new RecommendationSystem();
        // two features as listed under the UML
        recommendationSystem.start();
        recommendationSystem.recommendForUser("user0");
    }

}