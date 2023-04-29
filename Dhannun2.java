int sum = 0;
        System.out.println("Please enter Positive Integer & Negative integer to Terminate:");
        while(true){
            int num = put.nextInt();
            if(num < 0){
                System.out.println("You enter negative integer: "+num);
                break;
            }
            sum += num;
        }
        System.out.println("The sum of your number is "+sum);