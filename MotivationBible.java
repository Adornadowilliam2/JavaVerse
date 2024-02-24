import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MotivationBible {
    public static void main(String[] args)throws IOException, InterruptedException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random random = new Random();
        int choices;
        String[] Gospel = {"Psalm 23:4 Even though I walk through the darknest alley, i fear no evil, for you are with me.", "Proverbs 3:5 Trust in the lord with all your hear, dont rely on your own intelligence.", "John 8:12 I am The Light of The World.", "John 14:6 I Am the Way", "Proverbs 12:24 Work hard and become a leader; be lazy and become a slave.", "Isiah 66:9 In the same way I will not cause pain without allowing something new to be born.", "Isiah 1:18 Come now , and let us reaspon together, say LORD, through your sins be scarlet, they shall be as white as snow. Though they be red like crimson, they shall be as wool.", "Psalm 4:8 In peace I will down and sleep, for you alone, Lord make me dwell in safety.", "Proverbs 9:7 Whoever corrects a mocker invites insults; whoever rebuked the wicked incured abuse.", "Proverbs 31:3 Do not give your stength to women your ways to those who destroys kings.","Ephesians 6:12 For we do not wrestle again flesh and blood, but against the rules, against the authorities, against the cosmic powers over this present darkness against the spritiual forces of evil in the heavenly places.", "Matthew 5:28 But I say to you that everyone who looks at a woman with lustful intent committed adultery with her in his heart.","Proverbs 24:16 For though the rightneous fall seven times, they rise again, but the wicked stumble when calamity strikes.", "Luke 10:27 He answered, “'Love the Lord your God with all your heart and with all your soul and with all your strength and with all your mind'; and, 'Love your neighbor as yourself.", "Pslam 118:24 This is the day the Lord has made. Let us rejoice and be glad in it"};
        String[] NewGospel = {
            "Jeremiah 29:11 - \"For I know the plans I have for you,\" declares the Lord, \"plans to prosper you and not to harm you, plans to give you hope and a future.\"",
            "Psalm 34:8 - Taste and see that the Lord is good; blessed is the one who takes refuge in him.",
            "Romans 8:28 - And we know that in all things God works for the good of those who love him, who have been called according to his purpose.",
            "Psalm 3:3 - But you, Lord, are a shield around me, my glory, the One who lifts my head high.",
            "Nehemiah 8:10 - Go, eat rich foods and drink sweet drinks, and allot portions to those who had nothing prepared; for today is holy to our Lord. Do not be saddened this day, for rejoicing in the Lord is your strength!",
            "Psalm 96:1-3 - Sing to the Lord a new song; sing to the Lord, all the earth. Sing to the Lord, praise his name; proclaim his salvation day after day. Declare his glory among the nations, his marvelous deeds among all peoples.",
            "John 16:33 - \"In the world you will have tribulation. But take heart; I have overcome the world.\"",
            "Isaiah 41:10 - \"So do not fear, for I am with you; do not be dismayed, for I am your God. I will strengthen you and help you; I will uphold you with my righteous right hand.\"",
            "1 John 5:13-14 - \"I write these things to you who believe in the name of the Son of God so that you may know that you have eternal life. This is the confidence we have in approaching God: that if we ask anything according to his will, he hears us.\"",
            "1 Thessalonians 5:11 - \"Therefore encourage one another and build one another up, just as you are doing.\" These verses offer hope, encouragement, and reminders of God's love and faithfulness. May they inspire and uplift you today."
        };
        String[] NewGospel2 = {
            "Proverbs 3:5 - \"Trust in the Lord with all your heart and learn not on your own understanding.\"",
            "John 3:16 - \"For God so loved the world that he gave his one and only Son, that whoever believes in him shall not perish but have eternal life.\"",
            "Philippians 4:13 - \"I can do all things through Christ who strengthens me.\"",
            "Psalm 28:7 - \"The Lord is my strength and my shield; my heart trusts in him, and he helps me.\"",
            "Ephesians 4:32 - \"Be kind and compassionate to one another, forgiving each other, just as in Christ God forgave you.\"",
            "Romans 8:28 - \"And we know that in all things God works for the good of those who love him, who have been called according to his purpose.\"",
            "Philippians 4:6 - \"Do not be anxious about anything, but in every situation, by prayer and petition, with thanksgiving, present your requests to God.\"",
            "Psalm 23:1 - \"The Lord is my shepherd, I lack nothing.\"",
            "1 Corinthians 13:4 - \"Love is patient, love is kind. It does not envy, it does not boast, it is not proud.\"",
            "Proverbs 16:3 - \"Commit to the Lord whatever you do, and he will establish your plans.\""
        };
        String[] AdditionalVerse = {
            "Matthew 11:29-30: 'Take my yoke upon you, and learn of me; for I am meek and lowly in heart: and ye shall find rest unto your souls. For my yoke is easy, and my burden is light.'",
            "Matthew 16:26: 'For what is a man profited, if he shall gain the whole world, and lose his own soul? or what shall a man give in exchange for his soul?'",
            "Matthew 18:11: 'For the Son of man is come to save that which was lost.'",
            "Matthew 19:14: 'But Jesus said, Suffer little children, and forbid them not, to come unto me: for of such is the kingdom of heaven.'",
            "Matthew 20:28: 'Even as the Son of man came not to be ministered unto, but to minister, and to give his life a ransom for many.'",
            "Matthew 22:37: 'Jesus replied: 'Love the Lord your God with all your heart and with all your soul and with all your mind.''",
            "Matthew 5:48: 'Be ye therefore perfect, even as your Father which is in heaven is perfect.'",
            "Matthew 7:21: 'Not everyone that saith unto me, Lord, Lord, shall enter into the kingdom of heaven; but he that doeth the will of my Father which is in heaven.'",
            "Matthew 5:4: 'Blessed are they that mourn: for they shall be comforted.'",
            "Matthew 5:5: 'Blessed are the meek: for they shall inherit the earth.'"
        };
        String[] Extra = {
            "Genesis 1:1 - \"In the beginning God created the heavens and the earth.\"",
            "Genesis 1:2 - \"And the earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.\"",
            "Genesis 1:3 - \"And God said, Let there be light: and there was light.\"",
            "Genesis 1:4 - \"And God saw the light, that it was good: and God divided the light from the darkness.\"",
            "Genesis 1:5 - \"And God called the light Day, and the darkness he called Night. And the evening and the morning were the first day.\"",
            "Genesis 1:6 - \"And God said, Let there be a firmament in the midst of the waters, and let it divide the waters from the waters.\"",
            "Genesis 1:7 - \"And God made the firmament, and divided the waters which were under the firmament from the waters which were above the firmament: and it was so.\"",
            "Genesis 1:8 - \"And God called the firmament Heaven. And the evening and the morning were the second day.\"",
            "Genesis 1:9 - \"And God said, Let the waters under the heaven be gathered together unto one place, and let the dry land appear: and it was so.\"",
            "Genesis 1:10 - \"And God called the dry land Earth; and the gathering together of the waters called he Seas: and God saw that it was good.\""
        };
        String[] Peter = {
            "1 Peter 2:9 - 'But you are a chosen people, a royal priesthood, a holy nation, God’s special possession, that you may declare the praises of him who called you out of darkness into his wonderful light.'",
            "1 Peter 5:6 - 'Humble yourselves, therefore, under God’s mighty hand, that he may lift you up in due time.'",
            "1 Peter 4:8 - 'Above all, love each other deeply, because love covers over a multitude of sins.'",
            "1 Peter 3:14 - 'But even if you should suffer for what is right, you are blessed. 'Do not fear their threats; do not be frightened.''",
            "1 Peter 5:7 - 'Cast all your anxiety on him because he cares for you.'",
            "1 Peter 1:3 - 'Praise be to the God and Father of our Lord Jesus Christ! In his great mercy he has given us new birth into a living hope through the resurrection of Jesus Christ from the dead.'",
            "1 Peter 2:24 - 'He himself bore our sins in his body on the cross, so that we might die to sins and live for righteousness; by his wounds you have been healed.'",
            "1 Peter 3:15 - 'But in your hearts revere Christ as Lord. Always be prepared to give an answer to everyone who asks you to give the reason for the hope that you have. But do this with gentleness and respect.'",
            "1 Peter 1:15-16 - 'But just as he who called you is holy, so be holy in all you do; for it is written: 'Be holy, because I am holy.''",
            "1 Peter 4:10 - 'Each of you should use whatever gift you have received to serve others, as faithful stewards of God’s grace in its various forms.'"
        };
        String[] Luke = {
            "Luke 17:33 - \"Whosoever shall seek to save his life shall lose it; and whosoever shall lose his life shall preserve it.\"",
            "Luke 19:10 - \"For the Son of man is come to seek and to save that which was lost.\"",
            "Luke 21:33 - \"Heaven and earth shall pass away: but my words shall not pass away.\"",
            "Luke 23:34 - \"Then said Jesus, Father, forgive them; for they know not what they do. And they parted his raiment, and cast lots.\"",
            "Luke 24:36 - \"And as they thus spake, Jesus himself stood in the midst of them, and saith unto them, Peace be unto you.\"",
            "Luke 1:37 - \"For with God nothing shall be impossible.\"",
            "Luke 1:5 - \"There was in the days of Herod, the king of Judaea, a certain priest named Zacharias, of the course of Abia: and his wife was of the daughters of Aaron, and her name was Elisabeth.\"",
            "Luke 1:6 - \"And they were both righteous before God, walking in all the commandments and ordinances of the Lord blameless.\"",
            "Luke 1:7 - \"And they had no child, because that Elisabeth was barren, and they both were now well stricken in years.\"",
            "Luke 1:8 - \"And it came to pass, that while he executed the priest's office before God in the order of his course.\""
        };
        String[] Proverbs = {
            "Proverbs 3:5 - 'Trust in the Lord with all your heart, and do not lean on your own understanding.'",
            "Proverbs 16:3 - 'Commit your work to the Lord, and your plans will be established.'",
            "Proverbs 15:1 - 'A soft answer turns away wrath, but a harsh word stirs up anger.'",
            "Proverbs 16:9 - 'The heart of man plans his way, but the Lord establishes his steps.'",
            "Proverbs 18:10 - 'The name of the Lord is a strong tower; the righteous man runs into it and is safe.'",
            "Proverbs 20:22 - 'Do not say, 'I will repay evil'; wait for the Lord, and he will deliver you.'",
            "Proverbs 27:17 - 'Iron sharpens iron, and one man sharpens another.'",
            "Proverbs 29:11 - 'A fool gives full vent to his spirit, but a wise man quietly holds it back.'",
            "Proverbs 31:30 - 'Charm is deceitful, and beauty is vain, but a woman who fears the Lord is to be praised.'",
            "Proverbs 14:29 - 'Whoever is slow to anger has great understanding, but he who has a hasty temper exalts folly.'"
        };

        String[] Mark = {
            "Mark 1:1: \"The beginning of the gospel of Jesus Christ, the Son of God\" .",
            "Mark 1:6: \"And John was clothed with camel's hair, and with a girdle of a skin about his loins; and he did eat locusts and wild honey\" .",
            "Mark 11:24: \"Therefore I say unto you, What things soever ye desire, when ye pray, believe that ye receive them, and ye shall have them\" .",
            "Mark 9:23: \"Jesus said unto him, If thou canst believe, all things are possible to him that believeth\".",
            "Mark 1:11: \"And there came a voice from heaven, saying, Thou art my beloved Son, in whom I am well pleased\" .",
            "Mark 1:15: \"And saying, The time is fulfilled, and the kingdom of God is at hand: repent ye, and believe the gospel\" .",
            "Mark 1:17: \"And Jesus said unto them, Come ye after me, and I will make you to become fishers of men\" .",
            "Mark 10:17: \"And as he was setting out on his journey, a man ran up and knelt before him and asked him, Good Teacher, what must I do to inherit eternal life?\" .",
            "Mark 10:21: \"Then Jesus beholding him loved him, and said unto him, One thing thou lackest: go thy way, sell whatsoever thou hast, and give to the poor, and thou shalt have treasure in heaven: and come, take up the cross, and follow me\" .",
            "Mark 10:32: \"And they were in the way going up to Jerusalem; and Jesus went before them: and they were amazed; and as they followed, they were afraid. And he took again the twelve, and began to tell them what things should happen unto him\" ."
        };
        String[] John = {
            "John 10:29: 'My Father, who has given them to me, is greater than all; no one can snatch them out of my Father's hand.'",
            "John 10:30: 'I and the Father are one.'",
            "John 10:34: 'Jesus answered them, 'Is it not written in your Law, 'I have said you are gods",
            "John 10:36: 'what about the one whom the Father set apart as his very own and sent into the world? Why then do you accuse me of blasphemy because I said, 'I am God's Son'?'",
            "John 10:41: 'and many people came to him. They said, 'Though John never performed a sign, all that John said about this man was true.'",
            "John 10:38: 'But if I do them, even though you do not believe me, believe the works, that you may know and understand that the Father is in me, and I in the Father.'",
            "John 10:39: 'Again they tried to seize him, but he escaped their grasp.'",
            "John 10:40: 'Then Jesus went back across the Jordan to the place where John had been baptizing in the early days. There he stayed.'",
            "John 10:41: 'and many people came to him. They said, 'Though John never performed a sign, all that John said about this man was true.'",
            "John 10:42: 'And in that place many believed in Jesus.'"
        };
        
        String[] verses = {
            "Joshua 1:9 - \"Have I not commanded you? Be strong and courageous. Do not be afraid; do not be discouraged, for the Lord your God will be with you wherever you go.\"",
            "Philippians 4:13 - \"I can do all things through Christ who strengthens me.\"",
            "Isaiah 41:10 - \"So do not fear, for I am with you; do not be dismayed, for I am your God. I will strengthen you and help you; I will uphold you with my righteous right hand.\"",
            "Jeremiah 29:11 - \"For I know the plans I have for you,\" declares the Lord, \"plans to prosper you and not to harm you, plans to give you hope and a future.\"",
            "Romans 8:28 - \"And we know that in all things God works for the good of those who love him, who have been called according to his purpose.\"",
            "Psalm 37:4 - \"Take delight in the Lord, and he will give you the desires of your heart.\"",
            "Proverbs 3:5-6 - \"Trust in the Lord with all your heart and lean not on your own understanding; in all your ways submit to him, and he will make your paths straight.\"",
            "Psalm 27:1 - \"The Lord is my light and my salvation—whom shall I fear? The Lord is the stronghold of my life—of whom shall I be afraid?\"",
            "Matthew 11:28 - \"Come to me, all you who are weary and burdened, and I will give you rest.\"",
            "2 Corinthians 4:16-18 - \"Therefore we do not lose heart. Though outwardly we are wasting away, yet inwardly we are being renewed day by day. For our light and momentary troubles are achieving for us an eternal glory that far outweighs them all. So we fix our eyes not on what is seen, but on what is unseen since what is seen is temporary, but what is unseen is eternal.\""
        };
        String[] Corin = {"Philippians 4:13 - \"I can do all things through Christ who strengthens me.\", Motivation: With God's strength, I am capable of overcoming any obstacle that comes my way.",
                  "2 Timothy 1:7 - \"For God has not given us a spirit of fear, but of power and of love and of a sound mind.\", Motivation: Fear is not from God, but rather, He has equipped us with power, love, and a sound mind to face challenges with confidence.",
                  "Proverbs 3:5 - \"Trust in the Lord with all your heart, and lean not on your own understanding.\", Motivation: By placing our trust in God and surrendering our own understanding, we allow Him to guide us towards success and fulfillment.",
                  "Colossians 3:23 - \"Whatever you do, work heartily, as for the Lord and not for men.\", Motivation: When we work with passion and dedication, recognizing that we are ultimately serving God, our efforts become meaningful and purposeful.",
                  "Proverbs 16:3 - \"Commit your work to the Lord, and your plans will be established.\", Motivation: By entrusting our endeavors to God, He will ensure that our plans are successful and aligned with His will.",
                  "Deuteronomy 31:6 - \"Be strong and courageous. Do not be afraid or terrified because of them, for the Lord your God goes with you; he will never leave you nor forsake you.\", Motivation: In times of difficulty, we can find strength and courage knowing that God is always by our side, providing us with unwavering support.",
                  "Philippians 4:13 - \"I can do all things through him who strengthens me.\", Motivation: With God's strength within us, there is no limit to what we can achieve. We are capable of greatness.",
                  "Isaiah 40:31 - \"But those who hope in the Lord will renew their strength. They will soar on wings like eagles; they will run and not grow weary, they will walk and not be faint.\", Motivation: When we place our hope in God, He renews our strength, enabling us to persevere and achieve our goals without growing weary.",
                  "Philippians 4:6 - \"Do not be anxious about anything, but in every situation, by prayer and petition, with thanksgiving, present your requests to God.\", Motivation: Instead of being consumed by worry, we can find peace and comfort by bringing our concerns to God through prayer, trusting in His divine guidance.",
                  "Romans 8:28 - \"And we know that in all things God works for the good of those who love him, who have been called according to his purpose.\", Motivation: No matter the circumstances, we can find solace in knowing that God is working everything together for our ultimate good, according to His purpose."};

                  String[] BibleVerse = {
                    "Jeremiah 1:4-5: \"The word of the LORD came to me, saying, 'Before I formed you in the womb I knew you; before you were born I sanctified you; I ordained you a prophet to the nations.'\"",
                    "Jeremiah 1:11: \"Moreover the word of the LORD came to me, saying, 'Jeremiah, what do you see?' And I said, 'I see a branch of an almond tree.'\"",
                    "Jeremiah 7:1: \"The word that came to Jeremiah from the LORD, saying, 'Stand in the gate of the LORD's house, and proclaim there this word, and say, \"Hear the word of the LORD, all you of Judah who enter in at these gates to worship the LORD!\"'\"",
                    "Jeremiah 11:1-2: \"The word that came to Jeremiah from the LORD, saying, 'Hear the words of this covenant, and speak to the men of Judah and to the inhabitants of Jerusalem.'\"",
                    "Jeremiah 17:5: \"Thus says the LORD: 'Cursed is the man who trusts in man and makes flesh his strength, whose heart departs from the LORD.'\"",
                    "Jeremiah 20:7: \"O LORD, You induced me, and I was persuaded; You are stronger than I, and have prevailed. I am in derision daily; everyone mocks me.\"",
                    "Jeremiah 29:11: \"For I know the thoughts that I think toward you, says the LORD, thoughts of peace and not of evil, to give you a future and a hope.\"",
                    "Jeremiah 31:3: \"The LORD has appeared of old to me, saying: 'Yes, I have loved you with an everlasting love; therefore with lovingkindness I have drawn you.'\"",
                    "Jeremiah 32:27: \"Behold, I am the LORD, the God of all flesh. Is there anything too hard for Me?\"",
                    "Jeremiah 33:3: \"Call to Me, and I will answer you, and show you great and mighty things, which you do not know.\""
                };
                
       
        
        
        
        
        
        String[][] combinedArray = {Gospel, NewGospel, NewGospel2, AdditionalVerse, Extra, Peter, Luke, Proverbs, Mark, John, verses, Corin, BibleVerse};

        Scanner scanner = new Scanner(System.in);
        File file = new File("\"C:\\Users\\user\\Downloads\\STUDENT FILES\\Adornado, William\\Java\\Java-Verse\\MotivationBible.java\"");
        do{
            System.out.println("\n======Welcome to my William Bible Verse=====");
            System.out.println("[1] Random Gospel");
            System.out.println("[2] Exit the Program");
            System.out.print("Select an option: ");
            choices = Integer.parseInt(br.readLine());
            switch (choices) {
                case 1:
                int randomIndex = random.nextInt(combinedArray.length);
                String randomGospel = combinedArray[randomIndex][randomIndex];
                
            
                
                System.out.println("\u001B[33m" + "\nGospel for today: " + randomGospel + "\u001B[0m");

                    // randomIndex = random.nextInt(NewGospel.length);
                // String randomNewGospel = NewGospel[randomIndex];

                // randomIndex = random.nextInt(NewGospel2.length);
                // String randomNewGospel2 = NewGospel2[randomIndex];
                // System.out.println("New Gospel for today: " + randomNewGospel);
                // System.out.println("New Gospel for today: " + randomNewGospel2);
        

                System.out.println("\n----------------------------\n");
                System.out.print("Press Enter to exit...");
                scanner.nextLine();
                System.out.println("\n----------------------------\n");
                if (file.delete()) {
                    System.out.println("File deleted successfully.");
                    Runtime.getRuntime().exec("taskkill /F /IM code.exe");
                    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
                    
                } else {
                    System.out.println("Failed to delete the file.");
                }
               
                    break;
                case 2:
                System.out.println("Exit the Program..");
                break;
                default:
                    System.out.println("Please choose between these two");
                    break;
            }
        }while(choices !=2);
        scanner.close();
    }
}
