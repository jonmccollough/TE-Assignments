package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		
		int birds = 4;
		int birdsThatLeft = 1;
		int totalBirds = birds - birdsThatLeft;
		System.out.println(totalBirds);

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		
		int numOfBirds = 6;
		int numOfNests = 3;
		int numOfExtraBirds = numOfBirds - numOfNests;
		System.out.println(numOfExtraBirds);

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int intialRaccoons = 3;
		int raccoonsThatLeft = 2;
		int raccoonsLeftInWoods = intialRaccoons - raccoonsThatLeft;
		System.out.println(raccoonsLeftInWoods);

        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numOfFlowers = 5;
		int numOfBees = 3;
		int lessBeesThanFlowers = numOfFlowers - numOfBees;
		System.out.println(lessBeesThanFlowers);

        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int lonelyPigeon = 1;
		int anotherPigeon = 1;
		int totalPigeons = lonelyPigeon + anotherPigeon;
		System.out.println(totalPigeons);

        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsOnFence = 3;
		int joiningOwls = 2;
		int totalOwls = owlsOnFence + joiningOwls;
		System.out.println(totalOwls);

        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int beaversSwimming = 1;
		int totalBeaversWorking = beaversWorking - beaversSwimming;
		System.out.println(totalBeaversWorking);

        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansOnTree = 2;
		int toucansJoin = 1;
		int totalToucans = toucansOnTree + toucansJoin;
		System.out.println(totalToucans);

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nuts = 2;
		int squirrelsMoreThanNuts = squirrelsInTree - nuts;
		System.out.println(squirrelsMoreThanNuts);

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quarter = 0.25;
		double dime = 0.10;
		double nickel = 0.05;
		double nickel2 = 0.05;
		double totalMoneyFound = quarter + dime + nickel + nickel2;
		System.out.println(totalMoneyFound);

        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int mrsBriersClassMuffins = 18;
		int mrsMacAdamsClassMuffins = 20;
		int mrsFlannerysClassMuffins = 17;
		int totalGradeMuffins = mrsBriersClassMuffins + mrsMacAdamsClassMuffins + mrsFlannerysClassMuffins;
		System.out.println(totalGradeMuffins);

        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		double yoyoPrice = 0.24;
		double whistlePrice = 0.14;
		double totalSpentOnToys = yoyoPrice + whistlePrice;
		System.out.println(totalSpentOnToys);

        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalMarshmallows = largeMarshmallows + miniMarshmallows;
		System.out.println(totalMarshmallows);

        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHiltsHouse = 29;
		int snowAtBrecknockSchool = 17;
		int moreSnowAtHiltsHouse = snowAtHiltsHouse - snowAtBrecknockSchool;
		System.out.println(moreSnowAtHiltsHouse);

        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int hiltsInitialMoney = 10;
		int toyTruckPrice = 3;
		int pencilCasePrice = 2;
		int hiltsMoneyLeftOver = hiltsInitialMoney - toyTruckPrice - pencilCasePrice;
		System.out.println(hiltsMoneyLeftOver);

        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int joshsMarbleCollection = 16;
		int lostMarbels = 7;
		int newTotalOfJoshsCollection = joshsMarbleCollection - lostMarbels;
		System.out.println(newTotalOfJoshsCollection);

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int megansSeashells = 19;
		int desiredNumberOfSeashells = 25;
		int numberOfNeededSeashells = desiredNumberOfSeashells - megansSeashells;
		System.out.println(numberOfNeededSeashells);

        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int bradsTotalBalloons = 17;
		int redBalloons = 8;
		int greenBalloons = bradsTotalBalloons - redBalloons;
		System.out.println(greenBalloons);

        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int booksOnShelf = 38;
		int additionalBooks = 10;
		int totalBooks = booksOnShelf + additionalBooks;
		System.out.println(totalBooks);

        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int numberOfLegsOnABee = 6;
		int numberOfBees = 8;
		int totalNumberOfLegsOnBees = numberOfLegsOnABee * numberOfBees;
		System.out.println(totalNumberOfLegsOnBees);

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfIceCreamCone = 0.99;
		double totalIceCreamConesBought = 2;
		double totalPriceOfIceCreamCones = costOfIceCreamCone * totalIceCreamConesBought;
		System.out.println(totalPriceOfIceCreamCones);

        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalRocksNeededForBorder = 125;
		int numberOfRocksHiltHas = 64;
		int numberOfRocksNeededToComplete = totalRocksNeededForBorder - numberOfRocksHiltHas;
		System.out.println(numberOfRocksNeededToComplete);

        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltsMarbles = 38;
		int hiltsLostMarbles = 15;
		int hiltsLeftMarbles = hiltsMarbles - hiltsLostMarbles;
		System.out.println(hiltsLeftMarbles);

        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int hiltsTotalDistanceToDrive = 78;
		int hiltsDistanceDriven = 32;
		int hiltsTotalDistanceLeft = hiltsTotalDistanceToDrive - hiltsDistanceDriven;
		System.out.println(hiltsTotalDistanceLeft);

        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		double minutesHiltShoveledSaturday = 90;
		double minutesHiltShoveledSunday = 45;
		double totalTimeHiltShoveled = minutesHiltShoveledSaturday + minutesHiltShoveledSunday;
		System.out.println(totalTimeHiltShoveled);

        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		
		double totalHotdogsBought = 6;
		double costOfHotdogs = 0.50;
		double totalSpentOnHotdogs = totalHotdogsBought * costOfHotdogs;
		System.out.println(totalSpentOnHotdogs);

        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		double hiltsTotalMoney = .50;
		double priceOfPencil = 0.07;
		double totalAmountOfPencilsHiltCanAfford = hiltsTotalMoney / priceOfPencil;
		System.out.println(totalAmountOfPencilsHiltCanAfford);

        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterfliesSeen = 33;
		int orangeButterfliesSeen = 20;
		int redButterfliesSeen = totalButterfliesSeen - orangeButterfliesSeen;
		System.out.println(redButterfliesSeen);

        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double katesMoneyGivenToClerk = 1.00;
		double totalCostOfCandy = 0.54;
		double katesChange = katesMoneyGivenToClerk - totalCostOfCandy;
		System.out.println(katesChange);

        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int marksCurrentNumberOfTrees = 13;
		int additionalPlantedTrees = 12;
		int totalNumberOfTrees = marksCurrentNumberOfTrees + additionalPlantedTrees;
		System.out.println(totalNumberOfTrees);

        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int numberOfHoursInADay = 24;
		int daysUntilJoySeesGrandma = 2;
		int totalHoursUntilJoySeesGrandma = numberOfHoursInADay * daysUntilJoySeesGrandma;
		System.out.println(totalHoursUntilJoySeesGrandma);

        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfKimsCousins = 4;
		int gumPerCousin = 5;
		int totalAmountOfNeededGum = numberOfKimsCousins * gumPerCousin;
		System.out.println(totalAmountOfNeededGum);

        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		double dansInitialMoney = 3.00;
		double costOfCandyBar = 1.00;
		double dansRemainingMoney = dansInitialMoney - costOfCandyBar;
		System.out.println(dansRemainingMoney);

        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int totalBoatsInLake = 5;
		int peoplePerBoat = 3;
		int totalPeopleOnBoats = totalBoatsInLake * peoplePerBoat;
		System.out.println(totalPeopleOnBoats);

        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int ellenInitialLegos = 380;
		int ellenLostLegos = 57;
		int ellenCurrentLegos = ellenInitialLegos - ellenLostLegos;
		System.out.println(ellenCurrentLegos);

        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int arthursBakedMuffins = 35;
		int arthursDesiredNumberOfMuffins = 83;
		int arthursMuffinsLeftToBake = arthursDesiredNumberOfMuffins - arthursBakedMuffins;
		System.out.println(arthursMuffinsLeftToBake);

        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int numberOfMoreCrayonsWillyHas = willysCrayons - lucysCrayons;
		System.out.println(numberOfMoreCrayonsWillyHas);

        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int numberOfPages = 22;
		int totalNumberOfStickers = stickersOnPage * numberOfPages;
		System.out.println(totalNumberOfStickers);

        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int totalNumberOfCupcakes = 96;
		int numberOfChildren = 8;
		int numberOfCupcakesPerChild = totalNumberOfCupcakes / numberOfChildren;
		System.out.println(numberOfCupcakesPerChild);

        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int totalNumberOfGingerbreadCookies = 47;
		int numberOfCookiesPerJar = 6;
		int remainingCookiesNotInJars = totalNumberOfGingerbreadCookies % numberOfCookiesPerJar;
		System.out.println(remainingCookiesNotInJars);

        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int totalCroissants = 59;
		int numberOfNeighbors = 8;
		int totalCroissantsLeftOver = totalCroissants % numberOfNeighbors;
		System.out.println(totalCroissantsLeftOver);

        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesPerTray = 12;
		int totalNumberOfCookies = 276;
		int totalTraysNeeded = totalNumberOfCookies / cookiesPerTray;
		System.out.println(totalTraysNeeded);

        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int totalPretzels = 480;
		int oneServingOfPretzels = 12;
		int totalServingsOfPretzels = totalPretzels / oneServingOfPretzels;
		System.out.println(totalServingsOfPretzels);

        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCakesBaked = 53;
		int lemonCakesLeftAtHome = 2;
		int lemonCakesPerBox = 3;
		int newLemonCakeTotal = lemonCakesBaked - lemonCakesLeftAtHome;
		int numberOfBoxesGivenAway = newLemonCakeTotal / lemonCakesPerBox;
		System.out.println(numberOfBoxesGivenAway);

        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int totalCarrotSticks = 74;
		int peopleServedCarrotSticks = 12;
		int remainingCarrotSticks = totalCarrotSticks % peopleServedCarrotSticks;
		System.out.println(remainingCarrotSticks);

        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBears = 98;
		int teddyBearsPerShelf = 7;
		int totalShelvesNeeded = totalTeddyBears / teddyBearsPerShelf;
		System.out.println(totalShelvesNeeded);

        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int picturesPerAlbum = 20;
		int totalNumberOfPictures = 480;
		int totalNumberOfAlbumsNeeded = totalNumberOfPictures / picturesPerAlbum;
		System.out.println(totalNumberOfAlbumsNeeded);

        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int totalCards = 94;
		int cardsPerBox = 8;
		int numberOfFilledBoxes = totalCards / cardsPerBox;
		int numberOfUnfilledBoxes = totalCards % cardsPerBox;
		System.out.println(numberOfFilledBoxes);
		System.out.println(numberOfUnfilledBoxes);

        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int totalNumberOfBooks = 210;
		int totalShelvesRepaired = 10;
		int numberOfEquallyDistributedBooksPerShelf = totalNumberOfBooks / totalShelvesRepaired;
		System.out.println(numberOfEquallyDistributedBooksPerShelf);

        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int totalBakedCroissants = 17;
		int totalNumberOfGuests = 7;
		int croissantsPerGuests = totalBakedCroissants / totalNumberOfGuests;
		System.out.println(croissantsPerGuests);

        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		float billsPaintingRate = 2.15f;
		float jillsPaintingRate = 1.90f;
		float hoursPerDay = 8f;
		float billsDailyRoomRate = hoursPerDay / billsPaintingRate;
		float jillsDailyRoomRate = hoursPerDay / jillsPaintingRate;
		float combinedRate = billsDailyRoomRate + jillsDailyRoomRate;
		float totalRooms = 623f;
		float totalDaysToPaintAllTheRooms = totalRooms / combinedRate;
		System.out.println(totalDaysToPaintAllTheRooms);
		

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */
		
		String firstName = "Jon";
		String lastName = "McCollough";
		String middleInitial = "E";
		String fullName = lastName + ", " + firstName + " " + middleInitial + ".";
		System.out.println(fullName);
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		
		double distanceFromNYtoChicago = 800;
		double distanceTraveled = 537;
		double percentageTraveled = distanceTraveled / distanceFromNYtoChicago;
		int percentageTraveledInInteger = (int) percentageTraveled * 100;
		System.out.println(percentageTraveled);
		System.out.println(percentageTraveledInInteger);
		
		
	}

}
