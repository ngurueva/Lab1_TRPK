// Класс "Фасад", предоставляющий упрощенный интерфейс к подсистемам
class DescriptiveAnalysisFacade {
    private Averages averages;
    private Percentiles percentiles;
    private Dispersion dispersion;
    private Skewness skewness; // Добавляем экземпляр Skewness

    public DescriptiveAnalysisFacade() {
        this.averages = new Averages();
        this.percentiles = new Percentiles();
        this.dispersion = new Dispersion();
        this.skewness = new Skewness(); // Инициализируем Skewness
    }

    public void performDescriptiveAnalysis() {
        averages.calculateMean();
        averages.calculateMedian();
        averages.calculateMode();
        percentiles.calculateQuartiles();
        dispersion.calculateVarianceAndStandardDeviation();
        skewness.calculateSkewness(); // Вызываем метод расчета асимметрии
    }
}
