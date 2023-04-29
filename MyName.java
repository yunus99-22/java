
System.out.println("Please enter your Budget for month:");
        int budget = put.nextInt();
        System.out.println("Please enter each expense for month, if you finish enter \"00\"");
        int sum = 0;
        while(true){
            int exps = put.nextInt();
            if(exps == 00){
                System.out.println("You finish your expenses ");
                break;
            }
            sum += exps;
        }
        System.out.println("Total Budget is "+budget);
        if(sum < budget) 
        System.out.println("Total expenses is "+sum+" \"Under Budget\"");
        else if(sum > budget) 
        System.out.println("Total expenses is "+sum+" \"Over Budget\"");
        else 
        System.out.println("Total expenses is "+sum+" \"Equal Budget\"");
                