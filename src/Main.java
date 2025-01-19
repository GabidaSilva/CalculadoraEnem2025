import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Entrada das notas do ENEM
        double redacao = 920.00;
        double natureza = 639.80;
        double humanas = 701.90;
        double linguagens = 635.40;
        double matematica = 691.80;

        // Pesos das universidades
        Map<String, double[]> universidades = new HashMap<>();
        universidades.put("UFAL MACEIO", new double[]{1,1,1,1,1});
        universidades.put("UFAL ARAPIRACA", new double[]{1,1,1,1,1});
        universidades.put("UFAM AMAZONAS ", new double[]{2,2,1,2,1});
        universidades.put("UFERSA MOSSORO", new double[]{1.5,3.5,2,2,1});
        universidades.put("UFOB BARREIRAS", new double[]{5,5,2,4,2});
        universidades.put("UESC ILHEUS", new double[]{5,5,3,5,4});
        universidades.put("UFBA VITORIA DA CONQUISTA", new double[]{3,4,3,3,2});
        universidades.put("UFBA SALVADOR", new double[]{3,4,3,3,2});
        universidades.put("UFRB RECONCAVO BAIANO", new double[]{1,1,1,1,1});
        universidades.put("UFSB", new double[]{5,5,2,3,4});
        universidades.put("UNIVASF - BA", new double[]{1,1,1,1,1});
        universidades.put("UNIVASF - PE", new double[]{1,1,1,1,1});
        universidades.put("UFCA CARIRI", new double[]{2,3,1.5,2,1.5});
        universidades.put("UNILAB CE", new double[]{1,1,1,1,1});
        universidades.put("UFC SOBRAL", new double[]{1,1,1,1,1});
        universidades.put("UFC FORTALEZA", new double[]{1,1,1,1,1});
        universidades.put("UFES ESPIRITO SANTO", new double[]{4,4,2,3,2});
        universidades.put("UFCAT GO", new double[]{2,3,1.5,2,1.5});
        universidades.put("UFG GOIANIA", new double[]{2,3,1.5,2,1.5});
        universidades.put("UFJ JATAI", new double[]{2,3,1.5,2,1.5});
        universidades.put("UFMA SAO LUIS", new double[]{1,1,1,1,1});
        universidades.put("UFMA IMPERATRIZ", new double[]{1,1,1,1,1});
        universidades.put("UFMA PNHEIRO", new double[]{1,1,1,1,1});
        universidades.put("UNIFAL ALFENAS", new double[]{3,3,2,2,2});
        universidades.put("UFMG BH", new double[]{1,1,1,1,1});
        universidades.put("UFVJM DIAMANTINA", new double[]{3,3,2,2,2});
        universidades.put("UFVJM TEOFILO OTONI", new double[]{3,3,2,2,2});
        universidades.put("UFSJ DIVINOPOLIS", new double[]{2,2,1,2,1});
        universidades.put("UFSJ SAO JOAO DEL REI", new double[]{2,2,1,2,1});
        universidades.put("UFJF JUIZ DE FORA", new double[]{1,1,1,1,1});
        universidades.put("UFJF", new double[]{1,1,1,1,1});
        universidades.put("UFLA LAVRAS", new double[]{2,2,2,2,2});
        universidades.put("UFOP OURO PRETO", new double[]{1,1,1,1,1});
        universidades.put("UFTM TRIANGULO MINEIRO", new double[]{3,3,2,2,3});
        universidades.put("UFU UBERABA", new double[]{1,2,1,1,1});
        universidades.put("UFV VIÇOSA", new double[]{1,1,1,1,1});
        universidades.put("UEMS", new double[]{3,4,1,1,2});
        universidades.put("UFMS CAMPO GRANDE", new double[]{2,3,2,2,1});
        universidades.put("UFMS TRES LAGOAS", new double[]{2,3,2,2,1});
        universidades.put("UFGD DOURADOS", new double[]{1,1,1,1,1});
        universidades.put("UNEMAT", new double[]{3,4,3,3,2});
        universidades.put("UFMT CUIABA", new double[]{1,1,1,1,1});
        universidades.put("UFMT SINOP", new double[]{1,1,1,1,1});
        universidades.put("UFCG CAMPINA GRANDE", new double[]{1,1,1,1,1});
        universidades.put("UFCG CAJAZEIRAS", new double[]{1,1,1,1,1});
        universidades.put("UFPB JOAO PESSOA", new double[]{1,1,1,1,1});
        universidades.put("UFPE RECIFE", new double[]{2,3,1,2,2});
        universidades.put("UFPE CARUARU", new double[]{2.5,2.5,2,1.5,1.5});
        universidades.put("UPE RECIFE", new double[]{1,1,1,1,1});
        universidades.put("UPE GARANHUNS", new double[]{1,1,1,1,1});
        universidades.put("UFDPAR PARNAIBA", new double[]{3,5,2,5,4});
        universidades.put("UFPI PICOS", new double[]{3,5,2,5,4});
        universidades.put("UFPI TERESINA", new double[]{3,5,2,5,4});
        universidades.put("UESBI TERESINA", new double[]{3,5,2,5,3});
        universidades.put("UFPR TOLEDO", new double[]{1,1,1,1,1});
        universidades.put("UFPR CURITIBA", new double[]{1,1,1,1,1});
        universidades.put("UNILA FOZ DO IGUACU", new double[]{1,1,1,1,1});
        universidades.put("UFRJ RIO DE JANEIRO", new double[]{4,4,1,2,2});
        universidades.put("UFRJ MACAÉ", new double[]{3,2,1,2,1});
        universidades.put("UFF NITEROI", new double[]{3,3,1,2,1});
        universidades.put("UNIRIO", new double[]{3,3,2,3,2});
        universidades.put("UFRN NATAL", new double[]{1.5,3,1.5,1.5,1.5});
        universidades.put("UFRN CAICÓ", new double[]{1.5,3,1.5,1.5,1});
        universidades.put("UERN MOSSORO", new double[]{3,3,1,3,1});
        universidades.put("UFRR", new double[]{1,3,1,1,1});
        universidades.put("UFPEL PELOTAS", new double[]{1,1,1,1,1});
        universidades.put("UFCSPA PORTO ALEGRE", new double[]{1,1,1,1,1});
        universidades.put("UFFS RS", new double[]{1,1,1,1,1});
        universidades.put("UFFS CHAPECÓ", new double[]{1,1,1,1,1});
        universidades.put("UFRGS PORTO ALEGRE", new double[]{2,2,2,3,1});
        universidades.put("FURG", new double[]{3,2,2,2,1});
        universidades.put("UFSM SANTA MARIA", new double[]{1,1,1,1,1});
        universidades.put("UNIPAMPA", new double[]{1,1,1,1,1});
        universidades.put("UFSC ARARANGUÁ", new double[]{1.5, 1, 1, 1, 1});
        universidades.put("UFSC CURITIBANOS", new double[]{1.5, 1, 1, 1, 1});
        universidades.put("UFSC FLORIANOPOLIS", new double[]{1.5, 1, 1, 1, 1});
        universidades.put("UFS LAGARTO SE", new double[]{2,3.5,1,2,1.5});
        universidades.put("UFS ARACAJU", new double[]{2,3.5,1,2,1.5});
        universidades.put("UFSCAR SAAO CARLOS SP", new double[]{2,2,1,2,1});
        universidades.put("UFNT ARAGUAINA", new double[]{3,4,2,3,2});
        universidades.put("UFT PALMAS", new double[]{3,4,2,3,2});


        List<Map.Entry<String, Double>> resultados = new ArrayList<>();



        // Calcular média ponderada para cada universidade
        String melhorUniversidade = "";
        double melhorNota = 0;

        System.out.println("\nNotas calculadas por universidade:");
        for (Map.Entry<String, double[]> entry : universidades.entrySet()) {
            String universidade = entry.getKey();
            double[] pesos = entry.getValue();

            double notaPonderada = calcularMediaPonderada(redacao, natureza, humanas, linguagens, matematica, pesos);

            System.out.printf("%s: %.2f%n", universidade, notaPonderada);

            if (notaPonderada > melhorNota) {
                melhorNota = notaPonderada;
                melhorUniversidade = universidade;
            }
        }

        System.out.printf("\nMelhor colocação será na %s com nota de %.2f.%n",
                melhorUniversidade, melhorNota);

    }

    public static double calcularMediaPonderada(double redacao, double natureza, double humanas,
                                                double linguagens, double matematica, double[] pesos) {
        // Multiplicar as notas pelos pesos e somar
        double somaNotas = (redacao * pesos[0]) +
                (natureza * pesos[1]) +
                (humanas * pesos[2]) +
                (linguagens * pesos[3]) +
                (matematica * pesos[4]);

        // Somar os pesos
        double somaPesos = 0;
        for (double peso : pesos) {
            somaPesos += peso;
        }

        // Calcular a média ponderada
        return somaNotas / somaPesos;
    }
}