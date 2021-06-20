package mednotes3.demo.Helper;

import java.io.Serializable;

public class PatientResponse <T> implements Serializable {
    private T data;
    private String mesazhi;
    private int statusi;
    private String errori;

    public PatientResponse(PatientResponseBuilder patientResponseBuilder){
        this.data=(T)patientResponseBuilder.data;
        this.mesazhi=patientResponseBuilder.mesazhi;
        this.statusi=patientResponseBuilder.statusi;
        this.errori=patientResponseBuilder.errori;
    }



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMesazhi() {
        return mesazhi;
    }

    public void setMesazhi(String mesazhi) {
        this.mesazhi = mesazhi;
    }

    public int getStatusi() {
        return statusi;
    }

    public void setStatusi(int statusi) {
        this.statusi = statusi;
    }

    public String getErrori() {
        return errori;
    }

    public void setErrori(String errori) {
        this.errori = errori;
    }

    public static class PatientResponseBuilder<T>{
        private T data;
        private String mesazhi;
        private int statusi;
        private String errori;
        public PatientResponseBuilder(int statusi){
            this.statusi = statusi;
        }

        public PatientResponseBuilder setData(T data){
            this.data = data;
            return this;
        }
        public PatientResponseBuilder setMesazhin(String mesazhi){
            this.mesazhi = mesazhi;
            return this;
        }
        public PatientResponseBuilder setErrorin(String errori){
            this.errori = errori;
            return this;
        }
        public PatientResponse build(){
            return new PatientResponse(this);
        }

    }
}
