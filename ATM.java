class ATM{
    public int countBanknotes(int sum) {
        int count = 0;
        while(sum>=500){
            sum-=500;
            count++;
        }
        while(sum>=200){
            sum-=200;
            count++;
        }
        while(sum>=100){
            sum-=100;
            count++;
        }
        while(sum>=50){
            sum-=50;
            count++;
        }
        while(sum>=20){
            sum-=20;
            count++;
        }
        while(sum>=10){
            sum-=10;
            count++;
        }
        while(sum>=5){
            sum-=5;
            count++;
        }
        while(sum>=2){
            sum-=2;
            count++;
        }
        while(sum>=1){
            sum-=1;
            count++;
        }
        return count;

    }

}
