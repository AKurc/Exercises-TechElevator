package com.techelevator;

//public class AfternoonExercises {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//        
//        /* 
//        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
//        the branch? 
//        */
//int birds = 4 - 1;
//System.out.println(birds);
//
//        /* 
//        2. There are 6 birds and 3 nests. How many more birds are there than
//        nests? 
//        */
//int birdsAndNests = 6 - 3;
//System.out.println(birdsAndNests);
//        /* 
//        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
//        many raccoons are left in the woods? 
//        */
//int racoonsDinner = 3 - 2;
//System.out.println(racoonsDinner);
//        /* 
//        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
//        */
//int flowersBees;
//int flowers = 5;
//int bees = 3;
//flowersBees = flowers - bees;
//System.out.println(flowersBees);
//
//        /* 
//        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
//        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
//        */
//int pigeonEating = 1 + 1;
//System.out.println(pigeonEating);
//        /* 
//        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
//        owls are on the fence now? 
//        */
//int owlsFence = 3 + 2;
//System.out.println(owlsFence);
//        /* 
//        7. 2 beavers were working on their home. 1 went for a swim. How many
//        beavers are still working on their home? 
//        */
//int beavers = 2 - 1;
//System.out.println(beavers);
//        /* 
//        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
//        many toucans in all? 
//        */
//int toucans = 2 + 1;
//System.out.println(toucans);
//        /* 
//        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
//        are there than nuts? 
//        */
//int squirrelsNuts;
//int squirrels = 4;
//int nuts = 2;
//squirrelsNuts = squirrels - nuts;
//System.out.println(squirrelsNuts);
//        /* 
//        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
//        she find? 
//        */
//int cents;
//int quarter = 25;
//int dime = 10;
//int nickels = 5;
//cents = quarter + dime + (2 * nickels);
//System.out.println(cents);
//        /* 
//        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
//        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
//        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
//        grade bake in all? 
//        */
//int muffins;
//int muffinForBrier = 18;
//int muffinsForMacadams = 20;
//int muffinsForFlannery = 17;
//muffins = muffinForBrier + muffinsForMacadams + muffinsForFlannery;
//System.out.println(muffins);
//        /*
//        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
//        much did she spend in all for the two toys?
//        */
//int totalCostCents;
//int yoyoCost = 24;
//int whistleCost = 14;
//totalCostCents = yoyoCost + whistleCost;
//System.out.println(totalCostCents);
//        /*
//        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
//        and 10 mini marshmallows.How many marshmallows did she use
//        altogether?
//        */
// int FiveKTreats;
// int mashmallows = 8;
// int mini = 10;
// FiveKTreats = mashmallows + mini;
// System.out.println(FiveKTreats);
//        /*
//        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
//        Elementary School received 17 inches of snow. How much more snow
//        did Mrs. Hilt's house have?
//        */
//int snowAmountInches;
//int houseHilt = 29;
//int schoolBrecknock = 17;
//snowAmountInches = houseHilt - schoolBrecknock;
//System.out.println(snowAmountInches);
//        /*
//        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
//        case. How much money does she have left?
//        */
//int spendingByHiltDollars;
//int toyTruck = 10;
//int pencilCase = 2;
//spendingByHiltDollars = toyTruck + pencilCase;
//System.out.println(spendingByHiltDollars);
//        /*
//        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
//        marbles does he have now?
//        */
//int JoshsMarbles;
//int JoshsMarblesStart = 16;
//int JoshsMarblesLost = 7;
//JoshsMarbles = JoshsMarblesStart - JoshsMarblesLost;
//System.out.println(JoshsMarbles);
//        /*
//        17. Megan has 19 seashells. How many more seashells does she need to
//        find to have 25 seashells in her collection?
//        */
//int seashellsMegan;
//int seashellsStart = 19;
//int seashellsWanted = 25;
//seashellsMegan = seashellsWanted - seashellsStart;
//System.out.println(seashellsMegan);
//        /*
//        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
//        many green balloons does Brad have?
//        */
//int Bradballoons = 17;
//int redBalloons = 8;
//int greenBalloons;
//greenBalloons = Bradballoons - redBalloons;
//System.out.println(greenBalloons);
//        /*
//        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
//        How many books are on the shelf now?
//        */
//int beginningShelvedBooks = 38;
//int booksMarta = 10;
//int totalShelvedBooks;
//totalShelvedBooks = beginningShelvedBooks + booksMarta;
//System.out.println(totalShelvedBooks);
//        /*
//        20. A bee has 6 legs. How many legs do 8 bees have?
//        */
//int manybees = 8;
//int oneBeeLegs = 6;
//int totalBeeLegs;
//totalBeeLegs = manybees * oneBeeLegs;
//System.out.println(totalBeeLegs);
//        /*
//        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
//        cream cones cost?
//        */
//int costIceCrmConeCents;
//int iceCrmCone = 99;
//int numberIceCrmCones = 2;
//costIceCrmConeCents = iceCrmCone * numberIceCrmCones;
//System.out.println(costIceCrmConeCents);
//        /*
//        22. Mrs. Hilt wants to make a border around her garden. She needs 125
//        rocks to complete the border. She has 64 rocks. How many more rocks
//        does she need to complete the border?
//        */
// int borderGardenRocksTotal = 125;
// int gardenRocksHave = 64;
// int gardenRocksNeed;
// gardenRocksNeed = borderGardenRocksTotal - gardenRocksHave;
// System.out.println(gardenRocksNeed);
//        /*
//        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
//        she have left?
//        */
//int totalMarblesHilt = 38;
//int lostMarblesHilt = 15;
//int marblesLeft;
//marblesLeft = totalMarblesHilt - lostMarblesHilt;
//System.out.println(marblesLeft);
//        /*
//        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
//        miles and then stopped for gas. How many miles did they have left to drive?
//        */
//int totalMiles = 78;
//int milesDriven = 32;
//int milesLeft;
//int milesLeftToDrive = totalMiles - milesDriven;
//System.out.println(milesLeftToDrive);
//        /*
//        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
//        morning and 45 minutes shoveling snow on Saturday afternoon. How
//        much total time did she spend shoveling snow?
//        */
//int morningShovelMinutes = 90;
//int afternoonShovelMinutes = 45;
//int totalShovelMin;
//totalShovelMin = afternoonShovelMinutes + morningShovelMinutes;
//System.out.println(totalShovelMin);
//        /*    
//        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
//        money did she pay for all of the hot dogs?
//        */
//int hotDogsBought = 6;
//int hotDogCostCents= 50;
//int totatlHotDogsCost;
//totatlHotDogsCost = hotDogCostCents * hotDogsBought;
//System.out.println(totatlHotDogsCost);
//        /*
//        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
//        she buy with the money she has?
//        */
//int totalCentsHilt = 50;
//int pencilCostCents = 7;
//int pencilsToBuy;
//pencilsToBuy = (totalCentsHilt / pencilCostCents);
//System.out.println(pencilsToBuy);
//        /*    
//        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
//        were orange. If 20 of the butterflies were orange, how many of them
//        were red?
//        */
//int redButterflies = 33 - 20;
//System.out.println(redButterflies);
//        /*    
//        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
//        should Kate get back?
//        */
//int centsForKate = 100 - 54;
//System.out.println(centsForKate);
//        /*
//        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
//        will he have?
//        */
//int treesMarktotal;
//int currentMarktrees = 13;
//int plantMarktrees = 12;
//treesMarktotal = currentMarktrees + plantMarktrees;
//System.out.println(treesMarktotal);
//        /*    
//        31. Joy will see her grandma in two days. How many hours until she sees
//        her?
//        */
//int hoursInDay = 24;
//int seeGmaInDays = 2;
//int hoursTillGma;
//hoursTillGma = seeGmaInDays * hoursInDay;
//System.out.println(hoursTillGma);
//        /*
//        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
//        much gum will she need?
//        */
//int totalCousins = 4;
//int gumPerCousin = 5;
//int totalGum;
//totalGum = totalCousins * gumPerCousin;
//System.out.println(totalGum);
//        /*
//        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
//        left?
//        */
// int totalDanDollars = 3;
// int candyBarDollars = 1;
// int totalDollarsLeft;
// totalDollarsLeft = totalDanDollars - candyBarDollars;
// System.out.println(totalDollarsLeft);
//        /*
//        34. 5 boats are in the lake. Each boat has 3 people. How many people are
//        on boats in the lake?
//        */
//int boatsInLake = 5;
//int peoplePerBoat = 3;
//int peopleOnLake;
//peopleOnLake = boatsInLake * peoplePerBoat;
//System.out.println(peopleOnLake);
//        /*
//        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
//        have now?
//        */
//int legosRemaining = 380;
//int legosLost = 57;
//int legosOriginal;
//legosOriginal = legosRemaining + legosLost;
//System.out.println(legosOriginal);
//        /*
//        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
//        bake to have 83 muffins?
//        */
//int muffinsNeeded = 83 - 35;
//System.out.println(muffinsNeeded);
//        /*
//        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
//        crayons does Willy have then Lucy?
//        */
//int crayonsHorded = 1400 - 290;
//System.out.println(crayonsHorded);
//        /*
//        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
//        many stickers do you have?
//        */
//int stickersPerPage = 10;
//int pagesOfStickers = 22;
//int totalStickers;
//totalStickers = stickersPerPage * pagesOfStickers;
//System.out.println(totalStickers);
//        /*
//        39. There are 96 cupcakes for 8 children to share. How much will each
//        person get if they share the cupcakes equally?
//        */
//int cupcakesChildren = 96;
//int sharingChildren = 8;
//int sharedCupcakes;
//sharedCupcakes = cupcakesChildren / sharingChildren;
//System.out.println(sharedCupcakes);
//        /*
//        40. She made 47 gingerbread cookies which she will distribute equally in
//        tiny glass jars. If each jar is to contain six cookies each, how many
//        cookies will not be placed in a jar?
//        */
//int cookiesLeftOver = 47 / 6;
//System.out.println(cookiesLeftOver);
//        /*
//        41. She also prepared 59 croissants which she plans to give to her 8
//        neighbors. If each neighbor received and equal number of croissants,
//        how many will be left with Marian?
//        */
//int totalCroissant = 59;
//int neighbors = 8;
//int croissantLeftOver;
//croissantLeftOver = totalCroissant / neighbors;
//System.out.println(croissantLeftOver);
//        /*
//        42. Marian also baked oatmeal cookies for her classmates. If she can
//        place 12 cookies on a tray at a time, how many trays will she need to
//        prepare 276 oatmeal cookies at a time?
//        */
//int cookiesMarian = 276;
//int cookiesOnTray = 12;
//int traysForCookies;
//traysForCookies = cookiesMarian / cookiesOnTray;
//System.out.println(traysForCookies);
//        /*
//        43. Marian’s friends were coming over that afternoon so she made 480
//        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
//        servings of bite-sized pretzels was Marian able to prepare?
//        */
//int servingOfPretzels = 480 / 12;
//System.out.println(servingOfPretzels);
//        /*
//        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
//        orphanage. If two lemon cupcakes were left at home, how many
//        boxes with 3 lemon cupcakes each were given away?
//        */
//int cupcakesForOrphanage = 53;
//int cupcakesLeftHome = 2;
//int cupcakesPerBox = 3;
//int boxesToOrphanage;
//boxesToOrphanage = (cupcakesForOrphanage - cupcakesLeftHome) / cupcakesPerBox;
//System.out.println(boxesToOrphanage);
//        /*
//        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
//        were served equally to 12 people, how many carrot sticks were left
//        uneaten?
//        */
//int carrotSticksLeft = 74 / 12;
//System.out.println(carrotSticksLeft);
//        /*
//        46. Susie and her sister gathered all 98 of their teddy bears and placed
//        them on the shelves in their bedroom. If every shelf can carry a
//        maximum of 7 teddy bears, how many shelves will be filled?
//        */
//int filledShelves = 98 / 7;
//System.out.println(filledShelves);
//        /*
//        47. Susie’s mother collected all family pictures and wanted to place all of
//        them in an album. If an album can contain 20 pictures, how many
//        albums will she need if there are 480 pictures?
//        */
//int picPerAlbum = 20;
//int totalPics = 480;
//int neededAlbums;
//neededAlbums = picPerAlbum / totalPics;
//System.out.println(neededAlbums);
//        /*
//        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
//        room and placed them in boxes. If a full box can hold a maximum of 8
//        cards, how many boxes were filled and how many cards are there in
//        the unfilled box?
//        */
//int tradingCards = 94;
//int fullBoxCards = 8;
//int boxesFilled;
//int leftOverCards;
//boxesFilled = tradingCards / fullBoxCards;
//leftOverCards = tradingCards % boxesFilled;
//System.out.println(boxesFilled);
//System.out.println(leftOverCards);
//        /*
//        49. Susie’s father repaired the bookshelves in the reading room. If he has
//        210 books to be distributed equally on the 10 shelves he repaired,
//        how many books will each shelf contain?
//        */
//int booksPerShelf = 210 / 10;
//System.out.println(booksPerShelf);
//        /*
//        50. Cristina baked 17 croissants. If she planned to serve this equally to
//        her seven guests, how many will each have?
//        */
//int totalBakedCroissant = 17;
//int guestsOfCristing = 7;
//int croissantPerGuests;
//croissantPerGuests = totalBakedCroissant / guestsOfCristing;
//System.out.println(croissantPerGuests);
//	}
//
//}
public class AfternoonExercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        
        /* 
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch? 
        */
int birds = 4 - 1;
System.out.println(birds);

        /* 
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests? 
        */
	int birds2Nests;
	int birds2= 6;
	int nests= 3;
	birds2Nests = birds2 - nests;
	System.out.println(birds2Nests);

        /* 
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods? 
        */
	int racconsPlaying;
	int wood = 3;
	int dinner = 2;
	racconsPlaying = wood - dinner;
	System.out.println(racconsPlaying);;
        /* 
        4. There are 5 flowers and 3 bees. How many less bees than flowers? 
        */
int flowers = 5;
int bees = 3;
int flowerbees;
flowerbees = flowers - bees;
System.out.println(flowerbees);

        /* 
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now? 
        */
int lonelyPigeons = 1;
int anotherPigeon = 1;
int totalPigeons;
totalPigeons = lonelyPigeons + anotherPigeon;
System.out.println(totalPigeons);
        /* 
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now? 
        */

System.out.println();
        /* 
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home? 
        */

System.out.println();
        /* 
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all? 
        */

System.out.println();
        /* 
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts? 
        */

System.out.println();
        /* 
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find? 
        */

System.out.println();
        /* 
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all? 
        */

System.out.println();
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */

System.out.println();
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */

 System.out.println();
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
int snowAmountInches;
int houseHilt = 29;
int schoolBrecknock = 17;
snowAmountInches = houseHilt - schoolBrecknock;
System.out.println(snowAmountInches);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
int spendingByHiltDollars;
int toyTruck = 10;
int pencilCase = 2;
spendingByHiltDollars = toyTruck + pencilCase;
System.out.println(spendingByHiltDollars);
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
int JoshsMarbles;
int JoshsMarblesStart = 16;
int JoshsMarblesLost = 7;
JoshsMarbles = JoshsMarblesStart - JoshsMarblesLost;
System.out.println(JoshsMarbles);
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
int seashellsMegan;
int seashellsStart = 19;
int seashellsWanted = 25;
seashellsMegan = seashellsWanted - seashellsStart;
System.out.println(seashellsMegan);
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
int Bradballoons = 17;
int redBalloons = 8;
int greenBalloons;
greenBalloons = Bradballoons - redBalloons;
System.out.println(greenBalloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
int beginningShelvedBooks = 38;
int booksMarta = 10;
int totalShelvedBooks;
totalShelvedBooks = beginningShelvedBooks + booksMarta;
System.out.println(totalShelvedBooks);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
int manybees = 8;
int oneBeeLegs = 6;
int totalBeeLegs;
totalBeeLegs = manybees * oneBeeLegs;
System.out.println(totalBeeLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
int costIceCrmConeCents;
int iceCrmCone = 99;
int numberIceCrmCones = 2;
costIceCrmConeCents = iceCrmCone * numberIceCrmCones;
System.out.println(costIceCrmConeCents);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
 int borderGardenRocksTotal = 125;
 int gardenRocksHave = 64;
 int gardenRocksNeed;
 gardenRocksNeed = borderGardenRocksTotal - gardenRocksHave;
 System.out.println(gardenRocksNeed);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
int totalMarblesHilt = 38;
int lostMarblesHilt = 15;
int marblesLeft;
marblesLeft = totalMarblesHilt - lostMarblesHilt;
System.out.println(marblesLeft);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
int totalMiles = 78;
int milesDriven = 32;
int milesLeft;
int milesLeftToDrive = totalMiles - milesDriven;
System.out.println(milesLeftToDrive);
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
int morningShovelMinutes = 90;
int afternoonShovelMinutes = 45;
int totalShovelMin;
totalShovelMin = afternoonShovelMinutes + morningShovelMinutes;
System.out.println(totalShovelMin);
        /*    
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
int hotDogsBought = 6;
int hotDogCostCents= 50;
int totatlHotDogsCost;
totatlHotDogsCost = hotDogCostCents * hotDogsBought;
System.out.println(totatlHotDogsCost);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
int totalCentsHilt = 50;
int pencilCostCents = 7;
int pencilsToBuy;
pencilsToBuy = (totalCentsHilt / pencilCostCents);
System.out.println(pencilsToBuy);
        /*    
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
int redButterflies = 33 - 20;
System.out.println(redButterflies);
        /*    
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
int centsForKate = 100 - 54;
System.out.println(centsForKate);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
int treesMarktotal;
int currentMarktrees = 13;
int plantMarktrees = 12;
treesMarktotal = currentMarktrees + plantMarktrees;
System.out.println(treesMarktotal);
        /*    
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
int hoursInDay = 24;
int seeGmaInDays = 2;
int hoursTillGma;
hoursTillGma = seeGmaInDays * hoursInDay;
System.out.println(hoursTillGma);
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
int totalCousins = 4;
int gumPerCousin = 5;
int totalGum;
totalGum = totalCousins * gumPerCousin;
System.out.println(totalGum);
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
 int totalDanDollars = 3;
 int candyBarDollars = 1;
 int totalDollarsLeft;
 totalDollarsLeft = totalDanDollars - candyBarDollars;
 System.out.println(totalDollarsLeft);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
int boatsInLake = 5;
int peoplePerBoat = 3;
int peopleOnLake;
peopleOnLake = boatsInLake * peoplePerBoat;
System.out.println(peopleOnLake);
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
int legosRemaining = 380;
int legosLost = 57;
int legosOriginal;
legosOriginal = legosRemaining + legosLost;
System.out.println(legosOriginal);
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
int muffinsNeeded = 83 - 35;
System.out.println(muffinsNeeded);
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
int crayonsHorded = 1400 - 290;
System.out.println(crayonsHorded);
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
int stickersPerPage = 10;
int pagesOfStickers = 22;
int totalStickers;
totalStickers = stickersPerPage * pagesOfStickers;
System.out.println(totalStickers);
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
int cupcakesChildren = 96;
int sharingChildren = 8;
int sharedCupcakes;
sharedCupcakes = cupcakesChildren / sharingChildren;
System.out.println(sharedCupcakes);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
int cookiesLeftOver = 47 / 6;
System.out.println(cookiesLeftOver);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
int totalCroissant = 59;
int neighbors = 8;
int croissantLeftOver;
croissantLeftOver = totalCroissant / neighbors;
System.out.println(croissantLeftOver);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
int cookiesMarian = 276;
int cookiesOnTray = 12;
int traysForCookies;
traysForCookies = cookiesMarian / cookiesOnTray;
System.out.println(traysForCookies);
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
int servingOfPretzels = 480 / 12;
System.out.println(servingOfPretzels);
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
int cupcakesForOrphanage = 53;
int cupcakesLeftHome = 2;
int cupcakesPerBox = 3;
int boxesToOrphanage;
boxesToOrphanage = (cupcakesForOrphanage - cupcakesLeftHome) / cupcakesPerBox;
System.out.println(boxesToOrphanage);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
int carrotsBreakfast = 74;
int people = 12;
int carrotsLeft;
carrotsLeft = carrotsBreakfast / people;
System.out.println(carrotsLeft);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
int teddyBears = 98;
int shelfFilled;
int maxBearsPerShelf = 7;
shelfFilled = teddyBears / maxBearsPerShelf;
System.out.println(shelfFilled);
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */

System.out.println();
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
int tradingCards = 94;
int fullBox = 8;
int boxesFilled;
int leftOverCards = (94 % 8);
boxesFilled = tradingCards / fullBox;
System.out.println(boxesFilled);
System.out.println(leftOverCards);
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
int bookshelvesRepaired = 10;
int books = 210;
int booksOnShelves;
booksOnShelves = books / bookshelvesRepaired;
System.out.println(booksOnShelves);
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */

System.out.println();
	}

}
