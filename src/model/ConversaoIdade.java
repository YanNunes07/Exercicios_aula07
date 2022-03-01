package model;

public class ConversaoIdade {
    public int idade;

    public int calacularIdadeEmMeses(){
        return this.idade * 12;
    }

    public int calacularIdadeEmDias(){
        return this.idade * 365;
    }

    public int calcularIdadeEmSemanas(){
        return this.idade * 48;
    }

    public int calacularIdadeEmHoras(){
        return this.calacularIdadeEmDias() * 24;
    }

    public int calcularIdadeEmMinutos(){
        return this.calacularIdadeEmHoras() * 60;
    }

    public int calacularIdadeEmSegundos(){
        return this.calcularIdadeEmMinutos() * 60;
    }

    public String mostarDados(){
        return "\nIdade: "+this.idade;

    }

}
