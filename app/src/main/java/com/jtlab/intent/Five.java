package com.jtlab.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class Five extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("অধ্যায় পাঁচ");
        setSupportActionBar(toolbar);
        HtmlTextView htmlTextView =  findViewById(R.id.html_text);
        htmlTextView.setHtml("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "    <body>\n" +
                        "        <div class=\"post hentry\">\n" +
                        "<a name=\"3727605684856486639\"></a>\n" +
                        "<h3 class=\"post-title entry-title\">\n" +
                        "[প্রোগ্রামিং বইঃ অধ্যায় পাঁচ] একটুখানি গণিত।\n" +
                        "</h3>\n" +
                        "<div class=\"post-header\">\n" +
                        "<div class=\"post-header-line-1\"></div>\n" +
                        "</div>\n" +
                        "<div class=\"post-body entry-content\" id=\"post-body-3727605684856486639\">\n" +
                        "<div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\">\n" +
                        "এই অধ্যায়ে আমরা প্রোগ্রামিংয়ের নতুন কিছু শিখব না। এখন পর্যন্ত আমরা যতটুকু প্রোগ্রামিং শিখেছি, তা দিয়েই কিছু সহজ-সরল গাণিতিক সমস্যার সমাধান করব।<br>\n" +
                        "<br>\n" +
                        "১) x + y = 15, x – y = 5 হলে x ও y-এর মান কত?<br>\n" +
                        "<br>\n" +
                        "সমীকরণদুটি যোগ করলে পাই 2x = 20, বা x = 10। আবার বিয়োগ করলে পাই, 2y = 10, বা y = 5। এখন একটি প্রোগ্রাম লিখতে হবে যেখানে x + y ও x – y-এর মান দেওয়া থাকবে, x ও y-এর মান বের করতে হবে। আমি প্রোগ্রামটি একটু পরে লিখে দেব। এর মধ্যে তুমি নিজে লিখার চেষ্টা করো। সহজ প্রোগ্রাম। <br>\n" +
                        "<br>\n" +
                        "২) 4x + 5y = 14, 5x + 6y = 17 হলে x ও y-এর মান কত?<br>\n" +
                        "<br>\n" +
                        "সমীকরণদুটিকে আমরা এভাবে লিখতে পারি:<br>\n" +
                        "a1x + b1y = c1, a2x + b2y = c2। তোমরা বিভিন্নভাবে এর সমাধান করতে পার। এর মধ্যে দুটি জনপ্রিয় উপায় হচ্ছে প্রতিস্থাপন (substitution) ও নির্ণায়কের (determinant) সাহায্যে সমাধান। পদ্ধতিগুলো জানা না থাকলে ক্লাস এইট বা নাইনের গণিত বই দেখো। সমাধান করলে দেখবে,<br>\n" +
                        "x = (b2c1 – b1c2) / (a1b2 – a2b1) এবং y = (a1c2 – a2c1) / (a1b2 – a2b1)। এখন a1, a2, b1, b2, c1, c2-এর জায়গায় নির্দিষ্ট মান বসিয়ে দিলেই x ও y-এর মান পেয়ে যাবে।<br>\n" +
                        "<br>\n" +
                        "এই ধরনের সমীকরণ সমাধানের জন্যও আমরা একটি প্রোগ্রাম লিখব, যার ইনপুট হবে a1, a2, b1, b2, c1, c2 এবং আউটপুট হবে x ও y-এর মান। এটিও সহজ প্রোগ্রাম। নিজে চেষ্টা করো।<br>\n" +
                        "<br>\n" +
                        "আশা করি, তোমরা দুটি সমস্যারই সমাধান নিজে করে ফেলতে পারবে। এখন আমি প্রথম সমস্যার কোড দিচ্ছি:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     double x, y, x_plus_y, x_minus_y;  \n" +
                        "     printf(\"Enter the value of x + y: \");  \n" +
                        "     scanf(\"%lf\", &amp;x_plus_y);  \n" +
                        "     printf(\"Enter the value of x - y: \");  \n" +
                        "     scanf(\"%lf\", &amp;x_minus_y);  \n" +
                        "     x = (x_plus_y + x_minus_y) / 2;  \n" +
                        "     y = (x_plus_y - x_minus_y) / 2;  \n" +
                        "     printf(\"x = %0.2lf, y = %0.2lf\\n\", x, y);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৫.১  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "সমাধান খুবই সহজ। তবে লক্ষ করো যে আমি ভেরিয়েবলের ডাটা টাইপ int ব্যবহার না করে double ব্যবহার করেছি।<br>\n" +
                        "<br>\n" +
                        "এবারে দ্বিতীয় সমস্যার কোড:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     double a1, a2, b1, b2, c1, c2, x, y;  \n" +
                        "     printf(\"a1 = \");  \n" +
                        "     scanf(\"%lf\", &amp;a1);  \n" +
                        "     printf(\"a2 = \");  \n" +
                        "     scanf(\"%lf\", &amp;a2);  \n" +
                        "     printf(\"b1 = \");  \n" +
                        "     scanf(\"%lf\", &amp;b1);  \n" +
                        "     printf(\"b2 = \");  \n" +
                        "     scanf(\"%lf\", &amp;b2);  \n" +
                        "     printf(\"c1 = \");  \n" +
                        "     scanf(\"%lf\", &amp;c1);  \n" +
                        "     printf(\"c2 = \");  \n" +
                        "     scanf(\"%lf\", &amp;c2);  \n" +
                        "     x = (b2 * c1 - b1 * c2) / (a1 * b2 - a2 * b1);  \n" +
                        "     y = (a1 * c2 - a2 * c1) / (a1 * b2 - a2 * b1);  \n" +
                        "     printf(\"x = %0.2lf, y = %0.2lf\\n\", x, y);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৫.২  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "এটিও সহজ প্রোগ্রাম! তবে তোমরা দেখো (a1 * b2 - a2 * b1)-এর মান আমি দুবার বের করেছি (x-এর মান বের করার সময়, আবার y-এর মান বের করার সময়)। কাজটি একবারেই করা যেত এবং একবারে করলেই ভালো, তাহলে আমাদের প্রোগ্রাম দুটি গুণ ও একটি বিয়োগের কাজ কম করবে। আবার (a1 * b2 - a2 * b1)-এর মান যদি শূন্য হয়, তাহলে একটি ঝামেলা হয়ে যাচ্ছে, কারণ কোনো কিছুকে তো শূন্য দিয়ে ভাগ করা যায় না। তাই ওই মানটি শূন্য হলে আসলে সমীকরণের কোনো সমাধান নেই। এবার প্রোগ্রামটি আরও ভালোভাবে লিখে ফেলি।<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     double a1, a2, b1, b2, c1, c2, d, x, y;  \n" +
                        "     printf(\"a1 = \");  \n" +
                        "     scanf(\"%lf\", &amp;a1);  \n" +
                        "     printf(\"a2 = \");  \n" +
                        "     scanf(\"%lf\", &amp;a2);  \n" +
                        "     printf(\"b1 = \");  \n" +
                        "     scanf(\"%lf\", &amp;b1);  \n" +
                        "     printf(\"b2 = \");  \n" +
                        "     scanf(\"%lf\", &amp;b2);  \n" +
                        "     printf(\"c1 = \");  \n" +
                        "     scanf(\"%lf\", &amp;c1);  \n" +
                        "     printf(\"c2 = \");  \n" +
                        "     scanf(\"%lf\", &amp;c2);  \n" +
                        "     d = a1 * b2 - a2 * b1;  \n" +
                        "     if ((int) d == 0) {  \n" +
                        "         printf(\"Value of x and y can not be determined.\\n\");  \n" +
                        "     }  \n" +
                        "     else {  \n" +
                        "         x = (b2 * c1 - b1 * c2) / d;  \n" +
                        "         y = (a1 * c2 - a2 * c1) / d;  \n" +
                        "         printf(\"x = %0.2lf, y = %0.2lf\\n\", x, y);  \n" +
                        "     }  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৫.৩  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "এখানে একটি ব্যাপার খেয়াল করো। আমি if-এর ভেতর লিখেছি (int) d == 0। এখানে আমি প্রথমে d (যা একটি double টাইপের ভেরিয়েবল)-কে ইন্টিজারে টাইপ কাস্ট করে তারপর তার মানটি 0-এর সমান কি না তা পরীক্ষা করেছি। পরীক্ষাটা এভাবেও করা যেত: if (d == 0.0) তবে এতে মাঝে মাঝে ঝামেলা হয়, ফ্লোটিং পয়েন্ট-সংক্রান্ত হিসাব-নিকাশের জন্য। তোমরা কম্পিউটার আর্কিটেকচার নিয়ে লেখাপড়া করলে বিষয়টা বুঝতে পারবে।<br>\n" +
                        "<br>\n" +
                        "তোমাদের মনে একটি প্রশ্ন আসতে পারে যে এই সহজ সমস্যাগুলো প্রোগ্রামিং করে সমাধান করে কী লাভ? আসলে একবার প্রোগ্রাম লিখে ফেলার পরে কিন্তু আর সমাধান করতে হয় না। তারপর শুধু ইনপুট দেবে, প্রোগ্রামটি নিজেই সমস্যার সমাধান করে তোমাকে আউটপুট দেবে।<br>\n" +
                        "<br>\n" +
                        "৩) আমি যদি তোমাকে দশ হাজার টাকা ঋণ দিই 35% সুদে এবং টাকাটা পাঁচ বছর সময়ের মধ্যে তোমাকে সুদে-আসলে পরিশোধ করতে বলি, তাহলে পাঁচ বছরে মোট কত টাকা তোমার দিতে হবে এবং প্রতি মাসে কত টাকা দিতে হবে? ঋণটা যদি জটিল কিছু না হয়, তাহলে তোমার মোট পরিশোধ করতে হবে 10000 + 10000 * 35 / 100 টাকা। এই সহজ-সরল ঋণের জন্য একটি প্রোগ্রাম লিখে ফেলা যাক: <br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     double loan_amount, interest_rate, number_of_years, total_amount, monthly_amount;  \n" +
                        "     printf(\"Enter the loan amount: \");  \n" +
                        "     scanf(\"%lf\", &amp;loan_amount);  \n" +
                        "     printf(\"Enter the interest rate: \");  \n" +
                        "     scanf(\"%lf\", &amp;interest_rate);  \n" +
                        "     printf(\"Number of years: \");  \n" +
                        "     scanf(\"%lf\", &amp;number_of_years);  \n" +
                        "     total_amount = loan_amount + loan_amount * interest_rate / 100.00;  \n" +
                        "     monthly_amount = total_amount / (number_of_years * 12);  \n" +
                        "     printf(\"Total amount: %0.2lf\\n\", total_amount);  \n" +
                        "     printf(\"Monthly amount: %0.2lf\\n\", monthly_amount);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৫.৪  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "আমাদের ফর্মুলাতে একটু সমস্যা আছে। আসলে 35% সুদ দিতে হলে সেটা বাৎসরিক সুদ হবে। অর্থাৎ প্রতি বছর মোট ঋণের উপর 35% সুদ দেওয়া লাগবে। তাহলে দেখা যাচ্ছে পাঁচ বছরে তোমার মোট পরিশোধ করতে হবে 10000 + 10000 * 35 * 5 / 100 টাকা। এখন এই ফর্মুলা অনুযায়ী প্রোগ্রাম লিখে ফেলো।<br>\n" +
                        "<br>\n" +
                        "তবে বাস্তবে ঋণের হিসাব-নিকাশ কিন্তু এত সরল নয়। তুমি ব্যাংক থেকে ঋণ নিতে গেলেই সেটি টের পাবে। <br>\n" +
                        "<br>\n" +
                        "৪) পদার্থবিজ্ঞানের একটি সমস্যার সমাধান করা যাক। <br>\n" +
                        "<br>\n" +
                        "কোনো বস্তু u আদিবেগে (initial velocity) এবং a ত্বরণে (acceleration) যাত্রা শুরু করল (ত্বরণের মান সব সময় a থাকবে, বাড়বে বা কমবে না)।  t সময় পরে এর বেগ যদি v হয় তাহলে 2t সময়ে বস্তুটি কত দূরত্ব অতিক্রম করবে? (সমস্যাটি দিয়েছেন শাহরিয়ার মঞ্জুর, এটি ভ্যালাডলিড অনলাইন জাজের 10071 নম্বর সমস্যা)।<br>\n" +
                        "<br>\n" +
                        "2t সময়ে অতিক্রান্ত দূরত্ব হবে v x 2t। এটি প্রমাণ করে ফেলো। তারপর আবার পড়া শুরু করো। নবম-দশম শ্রেণীর পদার্থবিজ্ঞান বইতে তোমরা দুটি সূত্র পাবে:<br>\n" +
                        "v = u + at<br>\n" +
                        "s = ut + 0.5 at^2 (এখানে s হচ্ছে t সময়ে অতিক্রান্ত দূরত্ব)।<br>\n" +
                        "তাহলে 2t সময় পরে অতিক্রান্ত দূরত্ব হবে<br>\n" +
                        "u x 2t + 0.5 x a x (2t)^2 = u x 2t + 0.5 x a x 4t^2 = u x 2t + a x 2t^2 = 2t (u + at) = 2tv<br>\n" +
                        "<br>\n" +
                        "এখন, তোমাদেরকে একটি প্রোগ্রাম লিখতে হবে, যেখানে v ও t-এর মান ইনপুট হিসেবে দেওয়া হবে, 2t সময়ে অতিক্রান্ত দূরত্ব নির্ণয় করতে হবে। প্রোগ্রামটি নিজে নিজে লিখে ফেলো।<br>\n" +
                        "<br>\n" +
                        "৫) 1 + 2 + 3 + … + 998 + 999 + 1000 এই ধারার সমষ্টি কত?<br>\n" +
                        "<br>\n" +
                        "তোমরা যারা ধারার যোগফলের সূত্র জানো, তারা চট করে বলে দিতে পারবে, এই ধারাটির যোগফল হচ্ছে 1000 x 1001 / 2। তাহলে এর জন্য একটি প্রোগ্রাম লিখে ফেলা যাক, যেখানে শেষ পদের মান হবে ইনপুট আর আউটপুট হবে যোগফল।<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     int n, sum;  \n" +
                        "     scanf(\"%d\", &amp;n);  \n" +
                        "     sum = (n * (n + 1)) / 2;  \n" +
                        "     printf(\"Summation is %d\\n\", sum);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৫.৫  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "ধারার যোগফল নির্ণয়ের সূত্র জানা না থাকলে আমরা লুপ ব্যবহার করে প্রোগ্রামটি লিখতে পারি।<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     int i, n, sum;  \n" +
                        "     scanf(\"%d\", &amp;n);  \n" +
                        "     for(i = 1, sum = 0; i &lt;= n; i++) {  \n" +
                        "         sum = sum + i;  \n" +
                        "     }  \n" +
                        "     printf(\"Summation is %d\\n\", sum);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৫.৬  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "সুতরাং ধারার সমস্যা নিয়ে আর চিন্তা নেই। তুমি যদি একটি পদের মান তার আগের পদের চেয়ে কত করে বাড়ছে, সেটি বের করতে পারো, তাহলেই লুপ ব্যবহার করে যোগফল বের করে ফেলতে পারবে। তবে সূত্র বের করতে পারলে লুপ ব্যবহার না করাই ভালো। কারণ প্রথম প্রোগ্রামটি দেখো (যেখানে সূত্র ব্যবহার করেছি)। সেখানে একটি যোগ, একটি গুণ আর একটি ভাগ করতে হয়েছে, n-এর মান যত বড়ই হোক না কেন। আর দ্বিতীয় প্রোগ্রামে (যেখানে লুপ ব্যবহার করেছি) n-এর মান যত, ততবার যোগ করতে হয়েছে, আবার সেই যোগফলটি sum ভেরিয়েবলে রাখতে হয়েছে (ভেরিয়েবলে কোনো মান রাখতেও কিন্তু একটু সময় লাগে)।<br>\n" +
                        "<br>\n" +
                        "এখন তোমাদের একটি সহজ প্রোগ্রাম লিখতে হবে। প্রথম n সংখ্যক ধনাত্মক বেজোড় সংখ্যার যোগফল নির্ণয়ের প্রোগ্রাম। n-এর মান হবে ইনপুট, আর যোগফল হবে আউটপুট।<br>\n" +
                        "<br>\n" +
                        "৬) আমাদের এবারকার প্রোগ্রামটি হবে তাপমাত্রাকে সেলসিয়াস (Celsius) থেকে ফারেনহাইটে (Farenheit) রূপান্তর করার প্রোগ্রাম। <br>\n" +
                        "<br>\n" +
                        "সেলসিয়াসকে ফারেনহাইটে রূপান্তরের সূত্র হচ্ছে: °F = (°C × 1.8) + 32।<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     double celsius, farenheit;  \n" +
                        "     printf(\"Enter the temperature in celsius: \");  \n" +
                        "     scanf(\"%lf\", &amp;celsius);  \n" +
                        "     farenheit = 1.8 * celsius + 32;  \n" +
                        "     printf(\"Temperature in farenheit is: %lf\\n\", farenheit);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৫.৭  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "এখন তোমাদের কাজ হচ্ছে ফারেনহাইট থেকে সেলসিয়াসে রূপান্তরের প্রোগ্রাম লেখা।<br>\n" +
                        "<br>\n" +
                        "৭) এখন আমরা দুটি সংখ্যার গসাগু (GCD → Greatest Common Divisor বা HCF → Highest Common Factor) ও লসাগু (LCM → Least Common Multiple) নির্ণয় করার জন্য প্রোগ্রাম লিখব।<br>\n" +
                        "<br>\n" +
                        "দুটি সংখ্যার গসাগু হচ্ছে যেসব সংখ্যা দিয়ে ওই দুটি সংখ্যা নিঃশেষে বিভাজ্য হয়, তাদের মধ্যে সবচেয়ে বড় সংখ্যা। তাহলে আমরা যেটি করব, দুটি সংখ্যা a ও b নেব। তারপর এদের মধ্যে যেটি ছোট, সেই মানটি আবার x ভেরিয়েবলে রাখব। গসাগু এর মান x-এর চেয়ে বড় হওয়া সম্ভব নয় (5 ও 10-এর গসাগু-এর মান নিশ্চয়ই 5-এর চেয়ে বড় হবে না)। এখন a ও b, x দিয়ে নিঃশেষে বিভাজ্য হয় কি না (a % x == 0 এবং b % x == 0) সেটি পরীক্ষা করব। যদি হয় তবে আমরা গসাগু পেয়ে গেছি। যদি a ও b উভয়েই নিঃশেষে বিভাজ্য না হয়, তখন x-এর মান এক কমিয়ে পরীক্ষা করব। যতক্ষণ না আমরা গসাগু পাচ্ছি x-এর মান কমাতেই থাকব। একসময় আমরা গসাগু পাবই, কারণ x-এর মান যখন 1 হবে, তখন তো x দিয়ে a ও b দুটি সংখ্যাই নিঃশেষে বিভাজ্য। তোমরা কি প্রোগ্রামটি নিজে লিখার চেষ্টা করবে? না পারলে আমার কোড দেখো:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     int a, b, x, gcd;  \n" +
                        "     scanf(\"%d %d\", &amp;a, &amp;b);  \n" +
                        "     if (a &lt; b) {  \n" +
                        "         x = a;  \n" +
                        "     }  \n" +
                        "     else {  \n" +
                        "         x = b;  \n" +
                        "     }  \n" +
                        "     for(; x &gt;= 1; x--) {  \n" +
                        "         if (a % x == 0 &amp;&amp; b % x == 0) {  \n" +
                        "             gcd = x;  \n" +
                        "             break;  \n" +
                        "         }  \n" +
                        "     }  \n" +
                        "     printf(\"GCD is %d\\n\", gcd);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৫.৮  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "প্রোগ্রামে দেখো gcd পাওয়ার সঙ্গে সঙ্গে লুপ থেকে বের হয়ে যেতে হবে (আমি break ব্যবহার করেছি এই জন্য)। break ব্যবহার না করলে কী হবে সেটি পরীক্ষা করে দেখো।<br>\n" +
                        "<br>\n" +
                        "তবে গসাগু বের করার জন্য আমি যেই পদ্ধতি ব্যবহার করেছি সেটি খুব সহজ পদ্ধতি হলেও ইফিশিয়েন্ট (efficient) নয়। যেমন, সংখ্যা দুটি খুব বড় হলে এবং সহমৌলিক (co-prime) হলে লুপটি কিন্তু অনেকবার ঘুরবে। কারণ সহমৌলিক হলে গসাগু হবে 1। তোমরা নিশ্চয়ই জানো যে, দুটি সংখ্যার মধ্যে 1 ছাড়া আর কোনো সাধারণ উৎপাদক না থাকলে সংখ্যা দুটি সহমৌলিক। <br>\n" +
                        "<br>\n" +
                        "গসাগু বের করার জন্য ইউক্লিডের একটি চমৎকার পদ্ধতি আছে। ইউক্লিড ভাগশেষ উপপাদ্যের (division algorithm) সাহায্যে গসাগু বের করার উপায় দেখিয়েছেন। এই পদ্ধতিতে খুব সহজে গসাগু বের করা যায় এবং প্রোগ্রামটিও বেশ ইফিশিয়েন্ট হয়। এর জন্য দুটি জিনিস জানা লাগবে:<br>\n" +
                        "a ও 0-এর গসাগু-এর মান a।<br>\n" +
                        "a ও b-এর গসাগু = b ও a % b-এর গসাগু।<br>\n" +
                        "<br>\n" +
                        "তাহলে প্রোগ্রামে যেটি করতে হবে, একটি লুপের সাহায্যে a-এর মান b আর b-এর মান a%b বসিয়ে যেতে হবে, যতক্ষণ না b-এর মান শূন্য হয়। b-এর মান শূন্য হলেই বুঝে যাব যে গসাগু হচ্ছে a (এটা কিন্তু প্রোগ্রাম শুরুর সময় a-এর মান না, b-এর মান যখন শূন্য হবে সেই সময় a-এর মান)। <br>\n" +
                        "<br>\n" +
                        "<pre style=\"background-image: URL(http://2.bp.blogspot.com/_z5ltvMQPaa8/SjJXr_U2YBI/AAAAAAAAAAM/46OqEP32CJ8/s320/codebg.gif); background: #f0f0f0; border: 1px dashed #CCCCCC; color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; text-align: left; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()  \n" +
                        " {  \n" +
                        "     int a, b, t, x, gcd;  \n" +
                        "     scanf(\"%d %d\", &amp;a, &amp;b);  \n" +
                        "     if (a == 0) gcd = b;  \n" +
                        "     else if (b == 0) gcd = a;  \n" +
                        "     else {  \n" +
                        "         while (b != 0) {  \n" +
                        "             t = b;  \n" +
                        "             b = a % b;  \n" +
                        "             a = t;  \n" +
                        "         }  \n" +
                        "         gcd = a;  \n" +
                        "     }  \n" +
                        "     printf(\"GCD is %d\\n\", gcd);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৫.৯  \n" +
                        "</code></pre>\n" +
                        "<br>\n" +
                        "এই প্রোগ্রামটি আরও ইফিশিয়েন্ট করার চেষ্টা করো। <br>\n" +
                        "<br>\n" +
                        "এবার লসাগু বের করার প্রোগ্রাম। তোমরা নিশ্চয়ই স্কুলে শিখেছ, কীভাবে লসাগু বের করতে হয়। সেই পদ্ধতি অবলম্বন করে প্রোগ্রাম লিখে ফেলো। আর যারা সেই পদ্ধতি জানো না, তাদের জন্য একটি সূত্র বলে দিচ্ছি। আশা করি, লসাগু বের করার প্রোগ্রাম লিখতে আর সমস্যা হবে না।<br>\n" +
                        "<br>\n" +
                        "দুটি সংখ্যার লসাগু x দুটি সংখ্যার গসাগু = সংখ্যা দুটির গুণফল।<br>\n" +
                        "<br>\n" +
                        "</div>\n" +
                        "<div style=\"clear: both;\"></div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "    </body>\n" +
                        "</html>",
                new HtmlResImageGetter(htmlTextView));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
