package com.frameium.pageobject.ODBM;

import org.openqa.selenium.By;

public class BreadWebElements {

    //encapsulated method for locating elements in a private class.

    public static String Emails = "//div[@class='control _with-tooltip']/input[@name='username']";
    public static String firstnames = "//div/input[@name='firstname']";
    public static String lastnames = "//div/input[@name='lastname']";
    public static String companys = "//div/input[@name='company']";

    public static String Email1 = "//input[@id='email']";
    public static String firstnames1 = "//input[@id='TextField0']";
    public static String lastnames2 = "//input[@placeholder='Last name']";
    public static String city = "//input[@placeholder='City']";
    public static String ministries = "//span[text()='Our Ministry']";
    public static String ourMinistry = "//div[@class='min-h-9']/div/ul/li[4]/div/div/div";
    public static String joinNowbtn = "//span[text()='Join Now']";

    public static String firstGodhearName = "//input[@name='form_fields[fname]']";
    public static String lastGodhearName = "//input[@name='form_fields[lname]']";
    public static String EmailGodhear = "//input[@name='form_fields[email]']";
    public static String dropdownGodhear = "//select[@name='form_fields[location]']";
    public static String dropdownOptionsGod = "//select[@name='form_fields[location]']/option";
    public static String submitform = "//button[@type='submit']";
    public static String successMsg = "//h2[contains(text(),'you’ll see a note from')]";
    public static String successmsgNew = "//h2[starts-with(text(),'Welcome to the God')]";
    public static String podcastbtn = "//ul[@id='menu-1-88d0bcf']//descendant::a[@href='/podcast']";
    public static String episodeSearch = "//input[@placeholder='Search episodes...']";
    public static String playBtn = "//div[@class='player-grid__controls']/span[@aria-label='Play button']";
    public static String iframe = "//*[@title='Embed Player']";
    public static String forwardBtn = "//div[@class='player-grid__controls']/child::span[@aria-label='Play next episode']";
    public static String rewindBtn = "//div[@class='player-grid__controls']/child::span[@aria-label='Play previous episode']";
    public static String speedBtn = "//div[@class='player-grid__controls']/child::span[@aria-label='Player speed1']";
    public static String duration = "//div[@class='player-grid__duration']/time[1]";
    public static String searchReclaim = "(//div[@class='searchwp-form-input-container swp-items-stretch']/child::input[@type='search'])[1]";
    public static String toggleBtnss = "//div[@class='swp-toggle-switch swp-toggle-switch--mini']";
    public static String authorNames = "//select[@class='swp-select']/option";
    public static String articleImage = "//a[@href='https://reclaimtoday.org/burdens-and-freedom-in-christ/']//div//child::img";
    public static String moreOption = "(//span[text()='More...'])[1]";
        public static String moreWordss = "//div[@data-elementor-type='loop-item']";
    public static String shopDropdownElement= "//a[@class='elementor-item menu-link has-submenu highlighted']//following-sibling::ul/li";
    public static String shopBtn = "(//span[@role='application']//parent::a[contains(text(),'Shop')])[1]";
    public static String tShirt = "(//a[@href='https://reclaimtoday.org/product/short-sleeve-tshirt/'])[1]";
    public static String sizeDropdown = "//select[@id='pa_size']";
    public static String cartMsg = "//div[@class='woocommerce-message']/text()[normalize-space()]";
    public static String addTocartBtn = "//button[text()='Add to cart']";
    public static String plusBtn = "//*[@class='product_title entry-title']//following::a[contains(@id,'plus_qty')]";
    public static String quantity = "//*[@class='product_title entry-title']//following::input[@type='number']";
    public static String viewCartbtn = "//a[text()='View cart']";
    public static String connectWithGodElement = "(//span[@role='application']//parent::a[contains(text(),'Connect with God')])[1]";
    public static String connectWithGodDropdownelements = "(//span[@role='application']//parent::a[contains(text(),'Connect with God')])[1]//following-sibling::ul/li";
    public static String prayerText = "//h1[contains(text(),'Prayers')]";
    public static String prayerPara = "//div[@data-id='c2f9cc9']//child::p";
    public static String searchPrayer = "//div[@class='searchwp-form-input-container swp-items-stretch']//child::input";
    public static String audioCurrentTimeLocator = "//time[contains(text(),'0:')]";
    public static String Emailbtn = "//a[(contains(text(),'Email '))]";
    public static String firstSubscribename = "//form[@class='w-full flex flex-col space-y-3']//child::input[@name='newsletterFirstName']";
    public static String lastSubscribename = "//form[@class='w-full flex flex-col space-y-3']//child::input[@name='newsletterLastName']";
    public static String emailSubscribename = "//form[@class='w-full flex flex-col space-y-3']//child::input[@name='newsletterEmail']";
    public static String subscribeBtn = "(//form[@class='w-full flex flex-col space-y-3']//following::button//child::span[(contains(text(),'Subscribe'))])[1]";
    public static String printNBtn = "//a[(contains(text(),'Print '))]";
    public static String subscriberMsg = "//span[@class='text-stone-900/60 text-xs font-semibold']/text()[normalize-space()]";
    public static String monthlySubscribeBtn = "//a[(contains(text(),'Start Monthly Subscription'))]";
    public static String giveMonthlyBtn = "//span[(contains(text(),'Give Monthly'))]";
    public static String giveOnce = "//span[(contains(text(),'Give Once'))]";
    public static String onceText = "//div[(contains(text(),'Enter an Amount to Give One Time'))]";
    public static String monthlyText = "//div[(contains(text(),'Enter an Amount to Give Monthly'))]";
    public static String offersElements = "//ul[@class='flex flex-col space-y-3']/li/span[@class='text-stone-900 text-sm lg:text-base']";
    public static String languageElement = "//span[(contains(text(),'English - United States'))]";
    public static String multipleLanguageElements = "//div[@class='absolute bottom-full left-0 z-50 pb-3 max-h-none']//child::a/span";
    public static String devotionalsElement = "//span[text()='Devotionals']";
    public static String devotionalListElements = "//div[@class='min-h-9']/div/ul/li[2]/div/div/div//child::span[@class='text-sm font-normal']";
    public static String dailybreadElements = "(//*[@id=\"menu-header-nav\"]//li)[1]//child::a[@aria-haspopup=\"true\"]";
    public static String dailyBreadDropElements = "((//*[@id='menu-header-nav']//li)[1]//child::a[@aria-haspopup='true']//following::a)[1]";
    public static String imageElement = "//div[(contains(@class,'absolute top-0 right-0 bottom-0 left-0'))]";
    public static String fromDateElement = "//span[(contains(text(),'From Date'))]";
    public static String toDateElement = "//span[(contains(text(),'To Date'))]";
    public static String prevArrowElement = "//button[(contains(@aria-label,'Previous Month'))]";
    public static String nextArrowElement = "//button[(contains(@aria-label,'Next Month'))]";
    public static String yearPickdrop = "//span[@class='react-datepicker__year-read-view--down-arrow']";
    public static String yearPick = "//span[@class='react-datepicker__year-read-view--selected-year']";
    public static String monthDrop = "//span[@class='react-datepicker__month-read-view--down-arrow']";
    public static String currentMonthElement = "//span[@class='react-datepicker__month-read-view--selected-month']";
    public static String currentYear = "//span[@class='react-datepicker__year-read-view--selected-year']";
    public static String dateTableElement = "(//div[@class='react-datepicker__month']//child::*[@class='react-datepicker__week'])//child::*";
    public static String devotionalImages = "//ul[@class='flex flex-col divide-y divide-stone-950/10']//li/div/a//child::img";
    public static String nextDevotionalsBtn = "//button[(contains(text(),'Next'))]";
    public static String exploreBtn = "(//span[text()='Explore'])[1]";
    public static String collectionSearch = "//input[@placeholder = 'Search Collections...']";
    public static String collectionTitle = "//h1[(contains(text(),'Devotional Collections'))]";
    public static String imagesele = "img";
    public static String instaBtn = "//a[@href='https://www.instagram.com/myutmost/']//*[name()='svg']";
    public static String facebookBtn = "//a[@href='https://www.facebook.com/MyUtmostForHisHighest/']//*[name()='svg']";
    public static String twitterBtn = "//a[@href='https://twitter.com/myutmost']//*[name()='svg']";
    public static String pinInterest = "//a[@href='https://www.pinterest.com/myutmostforhishighest/']//*[name()='svg']";
    public static String volunteerBtn = "(//a[@aria-label='Volunteer']/span)[1]";
    public static String volunteerApplication = "//a[@title='Volunteer Application']";



}
