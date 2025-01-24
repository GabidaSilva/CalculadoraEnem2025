import java.util.HashMap;
import java.util.Map;

public class TerceiroDia {
    public static void main(String[] args) {

        // Entrada das notas do ENEM
        double redacao = 920.00;
        double natureza = 639.80;
        double humanas = 701.90;
        double linguagens = 635.40;
        double matematica = 691.80;

        // Pesos das universidades e notas de corte PCD
        Map<String, double[]> universidades = new HashMap<>();
        Map<String, Double> universidadesNotasCortePCD = new HashMap<>();

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
        universidades.put("UFDPAR PARNAIBA", new double[]{3,5,2,5,4});
        universidades.put("UFPI PICOS", new double[]{3,5,2,5,4});
        universidades.put("UFPI TERESINA", new double[]{3,5,2,5,4});
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

        universidadesNotasCortePCD.put("UFAL MACEIO", 736.52);
        universidadesNotasCortePCD.put("UFAL ARAPIRACA", 734.96);
        universidadesNotasCortePCD.put("UFAM AMAZONAS ",748.04);
        universidadesNotasCortePCD.put("UFERSA MOSSORO", 721.80);
        universidadesNotasCortePCD.put("UFOB BARREIRAS", 736.84);
        universidadesNotasCortePCD.put("UESC ILHEUS", 731.95);
        universidadesNotasCortePCD.put("UFBA VITORIA DA CONQUISTA", 737.80);
        universidadesNotasCortePCD.put("UFBA SALVADOR", 725.70);
        universidadesNotasCortePCD.put("UFRB RECONCAVO BAIANO", 713.78);
        universidadesNotasCortePCD.put("UFSB", 738.39);
        universidadesNotasCortePCD.put("UNIVASF - BA", 733.74);
        universidadesNotasCortePCD.put("UNIVASF - PE", 736.02);
        universidadesNotasCortePCD.put("UFCA CARIRI", 740.08);
        universidadesNotasCortePCD.put("UNILAB CE", 736.44);
        universidadesNotasCortePCD.put("UFC SOBRAL", 749.90);
        universidadesNotasCortePCD.put("UFC FORTALEZA", 753.10);
        universidadesNotasCortePCD.put("UFES ESPIRITO SANTO", 772.05);
        universidadesNotasCortePCD.put("UFCAT GO", 725.05);
        universidadesNotasCortePCD.put("UFG GOIANIA", 726.72);
        universidadesNotasCortePCD.put("UFJ JATAI", 735.01);
        universidadesNotasCortePCD.put("UFMA SAO LUIS", 733.56);
        universidadesNotasCortePCD.put("UFMA IMPERATRIZ", 732.16);
        universidadesNotasCortePCD.put("UFMA PNHEIRO", 723.50);
        universidadesNotasCortePCD.put("UNIFAL ALFENAS", 733.40);
        universidadesNotasCortePCD.put("UFMG BH", 753.48);
        universidadesNotasCortePCD.put("UFVJM DIAMANTINA",749.96);
        universidadesNotasCortePCD.put("UFVJM TEOFILO OTONI", 746.24);
        universidadesNotasCortePCD.put("UFSJ DIVINOPOLIS", 734.40);
        universidadesNotasCortePCD.put("UFSJ SAO JOAO DEL REI", 746.64);
        universidadesNotasCortePCD.put("UFJF JUIZ DE FORA", 743.02);
        universidadesNotasCortePCD.put("UFJF", 737.92);
        universidadesNotasCortePCD.put("UFLA LAVRAS", 758.86);
        universidadesNotasCortePCD.put("UFOP OURO PRETO", 755.60);
        universidadesNotasCortePCD.put("UFTM TRIANGULO MINEIRO", 752.78);
        universidadesNotasCortePCD.put("UFU UBERABA", 699.47);
        universidadesNotasCortePCD.put("UFV VIÇOSA", 729.38);
        universidadesNotasCortePCD.put("UEMS", 803.07);
        universidadesNotasCortePCD.put("UFMS CAMPO GRANDE", 734.26);
        universidadesNotasCortePCD.put("UFMS TRES LAGOAS", 727.49);
        universidadesNotasCortePCD.put("UFGD DOURADOS", 727.00);
        universidadesNotasCortePCD.put("UNEMAT", 715.35);
        universidadesNotasCortePCD.put("UFMT CUIABA", 730.66);
        universidadesNotasCortePCD.put("UFMT SINOP", 722.24);
        universidadesNotasCortePCD.put("UFCG CAMPINA GRANDE", 723.68);
        universidadesNotasCortePCD.put("UFCG CAJAZEIRAS", 725.78);
        universidadesNotasCortePCD.put("UFPB JOAO PESSOA", 747.20);
        universidadesNotasCortePCD.put("UFPE RECIFE",756.38);
        universidadesNotasCortePCD.put("UFPE CARUARU", 732.56);
        universidadesNotasCortePCD.put("UFDPAR PARNAIBA", 700.93);
        universidadesNotasCortePCD.put("UFPI PICOS", 760.76);
        universidadesNotasCortePCD.put("UFPI TERESINA", 723.39);
        universidadesNotasCortePCD.put("UFPR TOLEDO", 723.39);
        universidadesNotasCortePCD.put("UFPR CURITIBA", 771.52);
        universidadesNotasCortePCD.put("UNILA FOZ DO IGUACU", 718.68);
        universidadesNotasCortePCD.put("UFRJ RIO DE JANEIRO", 766.70);
        universidadesNotasCortePCD.put("UFRJ MACAÉ", 775.22);
        universidadesNotasCortePCD.put("UFF NITEROI", 758.53);
        universidadesNotasCortePCD.put("UNIRIO", 747.78);
        universidadesNotasCortePCD.put("UFRN NATAL", 738.71);
        universidadesNotasCortePCD.put("UFRN CAICÓ", 725.53);
        universidadesNotasCortePCD.put("UERN MOSSORO", 777.60);
        universidadesNotasCortePCD.put("UFRR", 728.86);
        universidadesNotasCortePCD.put("UFPEL PELOTAS", 740.24);
        universidadesNotasCortePCD.put("UFCSPA PORTO ALEGRE", 752.52);
        universidadesNotasCortePCD.put("UFFS RS", 730.96);
        universidadesNotasCortePCD.put("UFFS CHAPECÓ",733.86);
        universidadesNotasCortePCD.put("UFRGS PORTO ALEGRE", 745.23);
        universidadesNotasCortePCD.put("FURG", 750.76);
        universidadesNotasCortePCD.put("UFSM SANTA MARIA", 728.78);
        universidadesNotasCortePCD.put("UNIPAMPA", 720.90);
        universidadesNotasCortePCD.put("UFSC ARARANGUÁ",764.98);
        universidadesNotasCortePCD.put("UFSC CURITIBANOS", 740.09);
        universidadesNotasCortePCD.put("UFSC FLORIANOPOLIS", 757.04);
        universidadesNotasCortePCD.put("UFS LAGARTO SE", 715.57);
        universidadesNotasCortePCD.put("UFS ARACAJU",728.16);
        universidadesNotasCortePCD.put("UFSCAR SAAO CARLOS SP", 755.88);
        universidadesNotasCortePCD.put("UFNT ARAGUAINA",720.38);
        universidadesNotasCortePCD.put("UFT PALMAS", 729.80);

        // Calculando as médias ponderadas
        for (Map.Entry<String, double[]> entry : universidades.entrySet()) {
            String universidade = entry.getKey();
            double[] pesos = entry.getValue();

            double mediaPonderada = calcularMediaPonderada(redacao, natureza, humanas, linguagens, matematica, pesos);

            Double notaCorte = universidadesNotasCortePCD.get(universidade);
            if (notaCorte != null) {
                System.out.printf("Universidade: %s\n", universidade);
                System.out.printf("Média Ponderada: %.2f\n", mediaPonderada);
                System.out.printf("Nota de Corte PCD: %.2f\n", notaCorte);

                if (mediaPonderada >= notaCorte) {
                    System.out.println("Você está acima da nota de corte!\n");
                } else {
                    System.out.println("Você está abaixo da nota de corte.\n");
                }
            }
        }
    }

    public static double calcularMediaPonderada(double redacao, double natureza, double humanas, double linguagens, double matematica, double[] pesos) {
        double somaPesos = 0;
        for (double peso : pesos) {
            somaPesos += peso;
        }
        return (redacao * pesos[0] + natureza * pesos[1] + humanas * pesos[2] + linguagens * pesos[3] + matematica * pesos[4]) / somaPesos;
    }
}