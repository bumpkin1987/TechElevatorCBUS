package com.techelevator;

public class Exercises {

	public static void main(String[] args) {
        
        /*
        INSTRUCTIONS

        The primary purposes of these exercises are to practice: 
        		
        		1. declaring variables and using assignment statements
        		2. using variables, literals, and operators within arithmetic expressions
        		3. choosing meaningful variable names
        		4. choosing appropriate data types

        One of the hardest things about programming is choosing good names. Spend time
        to find good, meaningful, and descriptive names for your variables. Clarity and
        expressiveness is more important than brevity. Err on the side of longer, more 
        descriptive names over short, cryptic ones.

        Be consistent with your choice of datatypes, especially when it comes to 
        some values like money. There are many different ways to express money. Pick one, 
        and stick with it throughout these exercises.
        
        Keep your code consistent and well formatted. When code is poorly indented, 
        or lost in a flood of blank lines, it can make it difficult to read. 
        */

        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
		
		// ### EXAMPLE:  
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;
		System.out.println(remainingNumberOfBirds);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
		
		// ### EXAMPLE: 
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println(numberOfExtraBirds);
        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
		int numberOfRacoons = 3;
		int numberWentHomeToEat = 2;
		int numberOfRacoonsStayedInWoods = numberOfRacoons - numberWentHomeToEat;
		System.out.println(numberOfRacoonsStayedInWoods);
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int differenceOfFlowersToBees = numberOfFlowers - numberOfBees;
		System.out.println(differenceOfFlowersToBees);
        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
		int eatingPigeon = 1;
		int arrivingPigeon = 1;
		int totalEatingPigeons = eatingPigeon + arrivingPigeon;
		System.out.println(totalEatingPigeons);
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */
		int sittingOwls = 3;
		int joiningOwls = 2;
		int totalSittingOwls = sittingOwls + joiningOwls;
		System.out.println(totalSittingOwls);
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */
		int workingBeavers = 2;
		int leftToSwimBeavers = 1;
		int totalBeaversStillWorking = workingBeavers - leftToSwimBeavers;
		System.out.println(totalBeaversStillWorking);
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */
		int sittingToucans = 2;
		int arrivingToucans = 1;
		int totalNumberOfToucans = sittingToucans + arrivingToucans;
		System.out.println(totalNumberOfToucans);
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */
		int numberSquirrels = 4;
		int numberOfNuts = 2;
		int squirrelsVsNuts = numberSquirrels - numberOfNuts;
		System.out.println(squirrelsVsNuts);
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */
		int quarters = 1;
		int quarterValue = 25;
		int dimes = 1;
		int dimeValue = 10;
		int nickels = 2;
		int nickelValue = 5;
		double totalChangeAmount = (quarters * quarterValue) + (dimes * dimeValue) + (nickels * nickelValue);
		System.out.println(totalChangeAmount + " cents!");
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */
		int classMacAdams = 20;
		int classBrier = 18;
		int Flannery = 17;
		int totalAmountMuffins = classMacAdams + classBrier + Flannery;
		System.out.println(totalAmountMuffins);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        int yoyoCost = 24;
        int whistleCost = 14;
        int totalCost = yoyoCost + whistleCost;
        System.out.println(totalCost);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int lrgMarsh = 8;
        int miniMarsh = 10;
        int totalMarsh = lrgMarsh + miniMarsh;
        System.out.println(totalMarsh);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int hiltSnowLevel = 29;
        int brecknockSnowLevel = 17;
        int snowDifference = hiltSnowLevel - brecknockSnowLevel;
        System.out.println(snowDifference);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
        int totalStartMoney = 10;
        int toyTruckCost = 3;
        int pencilCost = 2;
        int moneyLeft = totalStartMoney - toyTruckCost - pencilCost;
        System.out.println(moneyLeft);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int totalMarbleCollection = 16;
        int lostMarbles = 7;
        int marblesLeft = totalMarbleCollection - lostMarbles;
        System.out.println(marblesLeft);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int totalSeaShells = 19;
        int totalSeaShellsNeeded = 25;
        int seaShellsAdded = totalSeaShellsNeeded - totalSeaShells;
        System.out.println(seaShellsAdded);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int totalNumBalloons = 17;
        int numRedBalloons = 8;
        int numGreenBalloons = totalNumBalloons - numRedBalloons;
        System.out.println(numGreenBalloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int intialNumBooks = 38;
        int booksAdded = 10;
        int totalBooks = intialNumBooks + booksAdded;
        System.out.println(totalBooks);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
       int beeLegs = 6;
       int multiBees = 8;
       int totalBeesLegs = beeLegs * multiBees;
       System.out.println(totalBeesLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
       	int iceCreamCone = 99;
      	int numIceCreamCones = 2;
      	double totalIceCreamConeCost = (iceCreamCone * numIceCreamCones) /100;
      	System.out.println(totalIceCreamConeCost  + " dollars!");
      	
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
       int totalRocksNeeded = 125;
       int currentRockCount = 64;
       int rocksNeeded = totalRocksNeeded - currentRockCount;
       System.out.println(rocksNeeded);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
       int startingNumMarbles = 38;
       int marblesLost = 15;
       int totalMarblesLeft = startingNumMarbles - marblesLost;
       System.out.println(totalMarblesLeft);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
       int totalTripMilage = 78;
       int milesDriven = 32;
       int milesLeftToGo = totalTripMilage - milesDriven;
       System.out.println(milesLeftToGo + " miles to go!");
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
        int timeMorning = 90;
        int timeAfternoon = 45;
        int totalTime = timeMorning + timeAfternoon;
        System.out.println(totalTime + " Minutes! That's a long time!");
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        
        double costHotdog= 0.5;
        double purchasedHotDogs = 6;
		double totalHotdogCost = purchasedHotDogs * costHotdog;
		System.out.println(totalHotdogCost + " dollars");
        
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        int moneyAmount = 50;
        int pencilCost1 = 7;
        int mostPencilsPurchasable = moneyAmount / pencilCost1;
        System.out.println(mostPencilsPurchasable + " pencils");
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int totalButterflies = 33;
        int numOrange = 20;
        int numRed = totalButterflies - numOrange;
        System.out.println(numRed);
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        int katesMoney = 100;
        int candyCost = 54;
        int changeBack = katesMoney - candyCost;
        System.out.println(changeBack + " cents back");
        
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int numTreesCurrent = 13;
        int numTreesPlanted = 12;
        int totalNumTrees = numTreesCurrent + numTreesPlanted;
        System.out.println(totalNumTrees);
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        int oneDay = 24;
        int daysTilGrannyVisit = 2;
        int hoursTilGranny = oneDay * daysTilGrannyVisit;
        System.out.println(hoursTilGranny + " hours til Grandma comes!!");
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int numCousins = 4;
        int piecesGum = 5;
        int totalAmountGum = numCousins * piecesGum;
        System.out.println("Kim needs to get " + totalAmountGum + " to give 5 pieces to each cousin.");
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        int dansMoney = 3;
        int candybarCost = 1;
        int moneyLeftOver = dansMoney - candybarCost;
        System.out.println(moneyLeftOver + " dollar(s)");
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int numBoats = 5;
        int numPeopleEachBoatHave = 3;
        int totalNumPeople = numBoats * numPeopleEachBoatHave;
        System.out.println(totalNumPeople);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int totalNumLegos = 380;
        int numLostLegos = 57;
        int numLegosLeft = totalNumLegos - numLostLegos;
        System.out.println(numLegosLeft);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int doneMuffins = 35;
        int numMuffinsNeeded = 85;
        int muffinsNeededBaked = numMuffinsNeeded - doneMuffins;
        System.out.println(muffinsNeededBaked);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int willysCrayons = 1400;
        int lucysCrayons = 290;
        int diffInCrayons = willysCrayons - lucysCrayons;
        System.out.println(diffInCrayons);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int numStickPerPage = 10;
        int numPages = 22;
        int totalNumStickers = numStickPerPage * numPages;
        System.out.println(totalNumStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int totalNumCupCakes = 96;
        int numKids = 8;
        int cupCakePerKid = totalNumCupCakes / numKids;
        System.out.println(cupCakePerKid);
        
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
        int totalCookies = 47;
        int cookieInJar = 6;
        int cookiesLeftOver = totalCookies % cookieInJar;
        System.out.println(cookiesLeftOver);
        
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
        int numCroissants = 59;
        int numNeighbors = 8;
        int croissantsLeftOver = numCroissants % numNeighbors;
        System.out.println(croissantsLeftOver);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int totalNumCookies = 276;
        int trayCapacity = 12;
        int traysBaking = totalNumCookies / trayCapacity;
        System.out.println(traysBaking);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int totalNumPretzels = 480;
        int singleServing = 12;
        int totalAmountServings = totalNumPretzels / singleServing;
        System.out.println(totalAmountServings);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int totalLemonCakes = 53;
        int cakesLeftAtHome = 2;
        int cakePerBox = 3;
        int totalBoxesGiven = ((totalLemonCakes - cakesLeftAtHome) / cakePerBox);
        System.out.println(totalBoxesGiven + " cupcake boxes were given away.");
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int carrotSticks = 74;
        int customers = 12;
        int carrotSticksLeft = carrotSticks % customers;
        System.out.println(carrotSticksLeft + " left uneaten.");
        
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int numTeddys = 98;
        int shelfCapacity = 7;
        int numShelvesFilled = numTeddys / shelfCapacity;
        System.out.println(numShelvesFilled + " needed to hold all the teddys.");
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int numPics = 480;
        int albumCapacity = 20;
        int totalNumAlbums = numPics / albumCapacity;
        System.out.println(totalNumAlbums + " are needed to hold all the pictures.");
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int numPlayingCards = 94;
        int boxCapacity = 8;
        int boxesFilled = numPlayingCards / boxCapacity; 
        int cardsInUnfilledBox = numPlayingCards % boxCapacity;
        System.out.println("There are " + boxesFilled + " boxes filled and " + cardsInUnfilledBox + " cards in the last box.");
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
        int totalNumBooks = 210;
        int numShelves = 10;
        int booksPerShelf = totalNumBooks / numShelves;
        System.out.println(booksPerShelf);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int totalNumCroissants = 17;
        int numGuests = 7;
        int pastryPerGuest = totalNumCroissants / numGuests;
        System.out.println(pastryPerGuest + " croissants per guest.");
        /*
            CHALLENGE PROBLEMS
        */
        
        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages 
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
        
        /******* If Bill paints a 12X14 room in 2.15hrs and Jill 1.90, you collect the average of both working on a room together which comes out as:
        	
        	-Let variable H (hour) (1) be the number of hours it takes both of them to paint one room.
        	-Variable b will be Bill.         b = 2.15
        	-variable j will be Jill.         j = 1.90
        	-Average will be as follows:      
        				
        			h/b + h/j = 1 ...      *cross multiply*
        		=>  h(j) + h(b) = 1(b)(j)...
        		=>  h(j + b) = b * j...    *divide to solve for h
        		=>  h = (b * j)/(b + j)... * how long it will take the both of them to paint 1 room.
        		
        		=>  h = (2.15 * 1.90)/(2.15 + 1.90) == 4.085/4.05 ≠ 1 hour (math checking)
        		
        		They can complete one room in (4.085/4.05) hrs
        		They need to do 623 rooms so we multiply (4.085/4.05) * 623 => 78.54 days to complete 
        		
        		OOOOORRRRRR!!!!
        		
        		Bill = 2.15 hrs
        		Jill = 1.90 hrs
        		                     ((2.15 + 1.9)/2) / 2 = 1.0125 then multiply by 623 then divide by 8 which comes too 78.8 days.
         **************/ 	
         
         
        float billAvg = 2.15f;
        float jillAvg = 1.90f;
        int totalNumRms = 623;
        int workDayHours = 8;
        int bothAvg = (int) (((((billAvg + jillAvg)/2)/2) * totalNumRms / workDayHours) + 1);
        System.out.println("It will take Bill and Jill " + bothAvg + " days to paint 623 rooms given their average speed."); 
        
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B." 
        */
        String firstName = "Matthew";
        String lastName = "Boyles";
        String middleInitial = "W.";
        String fullName = lastName + "," + " " + firstName + " " + middleInitial;
        System.out.println(fullName);
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles. 
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */ 
        float totalTripMiles = 800f;
        float milesTraveled = 537f;
        float percentageOfTripTaken = (milesTraveled / totalTripMiles) * 100;
        System.out.println((int)(percentageOfTripTaken) + "%" + " of the trip from New York to Chicago has been driven.");
 
            
	}

}
