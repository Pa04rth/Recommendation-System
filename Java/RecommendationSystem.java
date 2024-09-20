public class RecommendationSystem {
    // First we add all the necessary associated classes
    private DataIngestor dataIngestor; // it will provide the data
    private DataPreprocessor dataPreprocessor;
    private RecommendationEngine recommender;
    private FeedbackCollector feedbackCollector;

    public RecommendationSystem() {
        // We initialize all the associated classes
        recommender = new RecommendationEngine();

        // We did not initiate the following classes as defined above?
        // dataPreprocessor = new DataPreprocessor();
        // see its just like data injestor
        dataPreprocessor = new LowerCaseFilter();
        feedbackCollector = new FeedbackCollector();
    }

    public void start() {
        dataIngestor = new JSONDataIngestor("test file");
        dataIngestor.loadData();
        dataPreprocessor.preprocess("load data");

    }

    public void recommendForUser(String userId) {
        // Genrate and show the recommendations
        recommender.setRecommendationStrategy(new CollaborativeStrategy());
        recommender.generateRecommendations(userId);
        // For collecting user feedback
        // user liked it -
        feedbackCollector.collect("user", "item1", true);
        // User did not like item2
        feedbackCollector.collect("user", "item2", false);
    }

}
