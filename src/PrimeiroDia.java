import java.util.*;

public class PrimeiroDia {
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
        universidadesNotasCortePCD.put("UFAL ARAPIRACA", 731.02);
        universidadesNotasCortePCD.put("UFAM AMAZONAS ",739.30);
        universidadesNotasCortePCD.put("UFERSA MOSSORO", 715.12);
        universidadesNotasCortePCD.put("UFOB BARREIRAS", 748.10);
        universidadesNotasCortePCD.put("UESC ILHEUS", 715.13);
        universidadesNotasCortePCD.put("UFBA VITORIA DA CONQUISTA", 728.72);
        universidadesNotasCortePCD.put("UFBA SALVADOR", 720.72);
        universidadesNotasCortePCD.put("UFRB RECONCAVO BAIANO", 713.78);
        universidadesNotasCortePCD.put("UFSB", 714.75);
        universidadesNotasCortePCD.put("UNIVASF - BA", 733.74);
        universidadesNotasCortePCD.put("UNIVASF - PE", 736.02);
        universidadesNotasCortePCD.put("UFCA CARIRI", 740.08);
        universidadesNotasCortePCD.put("UNILAB CE", 741.98);
        universidadesNotasCortePCD.put("UFC SOBRAL", 749.90);
        universidadesNotasCortePCD.put("UFC FORTALEZA", 755.40);
        universidadesNotasCortePCD.put("UFES ESPIRITO SANTO", 769.91);
        universidadesNotasCortePCD.put("UFCAT GO", 735.01);
        universidadesNotasCortePCD.put("UFG GOIANIA", 740.73);
        universidadesNotasCortePCD.put("UFJ JATAI", 703.89);
        universidadesNotasCortePCD.put("UFMA SAO LUIS", 733.56);
        universidadesNotasCortePCD.put("UFMA IMPERATRIZ", 723.90);
        universidadesNotasCortePCD.put("UFMA PNHEIRO", 723.50);
        universidadesNotasCortePCD.put("UNIFAL ALFENAS", 751.85);
        universidadesNotasCortePCD.put("UFMG BH", 753.48);
        universidadesNotasCortePCD.put("UFVJM DIAMANTINA",737.14);
        universidadesNotasCortePCD.put("UFVJM TEOFILO OTONI", 746.24);
        universidadesNotasCortePCD.put("UFSJ DIVINOPOLIS", 717.05);
        universidadesNotasCortePCD.put("UFSJ SAO JOAO DEL REI", 727.10);
        universidadesNotasCortePCD.put("UFJF JUIZ DE FORA", 745.08);
        universidadesNotasCortePCD.put("UFJF", 740.30);
        universidadesNotasCortePCD.put("UFLA LAVRAS", 749.34);
        universidadesNotasCortePCD.put("UFOP OURO PRETO", 755.60);
        universidadesNotasCortePCD.put("UFTM TRIANGULO MINEIRO", 740.18);
        universidadesNotasCortePCD.put("UFU UBERABA", 721.62);
        universidadesNotasCortePCD.put("UFV VIÇOSA", 752.02);
        universidadesNotasCortePCD.put("UEMS", 807.82);
        universidadesNotasCortePCD.put("UFMS CAMPO GRANDE", 734.26);
        universidadesNotasCortePCD.put("UFMS TRES LAGOAS", 723.10);
        universidadesNotasCortePCD.put("UFGD DOURADOS", 757.32);
        universidadesNotasCortePCD.put("UNEMAT", 710.11);
        universidadesNotasCortePCD.put("UFMT CUIABA", 727.12);
        universidadesNotasCortePCD.put("UFMT SINOP", 697.42);
        universidadesNotasCortePCD.put("UFCG CAMPINA GRANDE", 721.76);
        universidadesNotasCortePCD.put("UFCG CAJAZEIRAS", 710.80);
        universidadesNotasCortePCD.put("UFPB JOAO PESSOA", 737.16);
        universidadesNotasCortePCD.put("UFPE RECIFE",756.38);
        universidadesNotasCortePCD.put("UFPE CARUARU", 732.39);
        universidadesNotasCortePCD.put("UFDPAR PARNAIBA", 700.56);
        universidadesNotasCortePCD.put("UFPI PICOS", 722.72);
        universidadesNotasCortePCD.put("UFPI TERESINA", 716.35);
        universidadesNotasCortePCD.put("UFPR TOLEDO", 731.96);
        universidadesNotasCortePCD.put("UFPR CURITIBA", 771.52);
        universidadesNotasCortePCD.put("UNILA FOZ DO IGUACU", 751.00);
        universidadesNotasCortePCD.put("UFRJ RIO DE JANEIRO", 773.22);
        universidadesNotasCortePCD.put("UFRJ MACAÉ", 760.76);
        universidadesNotasCortePCD.put("UFF NITEROI", 758.53);
        universidadesNotasCortePCD.put("UNIRIO", 747.78);
        universidadesNotasCortePCD.put("UFRN NATAL", 738.71);
        universidadesNotasCortePCD.put("UFRN CAICÓ", 716.94);
        universidadesNotasCortePCD.put("UERN MOSSORO", 765.16);
        universidadesNotasCortePCD.put("UFRR", 738.67);
        universidadesNotasCortePCD.put("UFPEL PELOTAS", 740.02);
        universidadesNotasCortePCD.put("UFCSPA PORTO ALEGRE", 748.54);
        universidadesNotasCortePCD.put("UFFS RS", 703.40);
        universidadesNotasCortePCD.put("UFFS CHAPECÓ",733.86);
        universidadesNotasCortePCD.put("UFRGS PORTO ALEGRE", 737.16);
        universidadesNotasCortePCD.put("FURG", 736.43);
        universidadesNotasCortePCD.put("UFSM SANTA MARIA", 726.26);
        universidadesNotasCortePCD.put("UNIPAMPA", 727.04);
        universidadesNotasCortePCD.put("UFSC ARARANGUÁ",764.98);
        universidadesNotasCortePCD.put("UFSC CURITIBANOS", 0.0);
        universidadesNotasCortePCD.put("UFSC FLORIANOPOLIS", 773.44);
        universidadesNotasCortePCD.put("UFS LAGARTO SE", 715.57);
        universidadesNotasCortePCD.put("UFS ARACAJU",728.16);
        universidadesNotasCortePCD.put("UFSCAR SAAO CARLOS SP", 755.88);
        universidadesNotasCortePCD.put("UFNT ARAGUAINA",710.29);
        universidadesNotasCortePCD.put("UFT PALMAS", 720.38);

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