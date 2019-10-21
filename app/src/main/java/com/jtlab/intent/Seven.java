package com.jtlab.intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import org.sufficientlysecure.htmltextview.HtmlResImageGetter;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public class Seven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("অধ্যায় সাত");
        setSupportActionBar(toolbar);
        HtmlTextView htmlTextView =  findViewById(R.id.html_text);
        htmlTextView.setHtml("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "    <div class=\"post hentry\">\n" +
                        "<a name=\"8611391974500242443\"></a>\n" +
                        "<h3 class=\"post-title entry-title\">\n" +
                        "[প্রোগ্রামিং বইঃ অধ্যায় সাত] ফাংশন (Function)।\n" +
                        "</h3>\n" +
                        "<div class=\"post-header\">\n" +
                        "<div class=\"post-header-line-1\"></div>\n" +
                        "</div>\n" +
                        "<div class=\"post-body entry-content\" id=\"post-body-8611391974500242443\">\n" +
                        "<div dir=\"ltr\" style=\"text-align: left;\" trbidi=\"on\"><div style=\"text-align: justify;\">তোমরা কি একটি মজার ব্যাপার জানো? একজন লেখক সারা জীবনে যতটা সময় লেখেন তার চেয়ে বেশি সময় তিনি অন্যের লেখা পড়েন? ব্যাপারটি প্রোগ্রামারদের বেলাতেও সত্য। একজন প্রোগ্রামার তার প্রোগ্রামিং জীবনে যতটা সময় নিজে কোড লেখে তার চেয়ে বেশি সময় অন্যের লেখা কোড পড়ে! তাই কোড লিখার সময় খেয়াল রাখতে হবে, যেন সেটি পড়াও সুবিধাজনক হয়।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">যারা বইটি শুরু থেকে পড়ে এসেছ তারা ইতিমধ্যে অনেকবার ফাংশন শব্দটি দেখেছ। যারা আরও বেশি মনোযোগ দিয়ে পড়েছ তারা এটিও খেয়াল করেছ যে printf, scanf ইত্যাদি, যেগুলো তোমরা ব্যবহার করছ সেগুলো একেকটি ফাংশন। আবার mainও একটি ফাংশন। আমরা এবার দেখব ফাংশন ব্যাপারটি আসলে কী, এর দরকারটাই বা কী। আর তারপর আমরা নিজেদের ফাংশন তৈরি করা শিখব।</div><div style=\"text-align: justify;\"><br>\n" +
                        "</div><div style=\"text-align: justify;\">ফাংশন ব্যবহার করা হয় কোনো একটি নির্দিষ্ট কাজ করার জন্য। যেমন printf ফাংশনটি দিয়ে আমরা মনিটরে আউটপুট দিই। আবার scanf, getchar এসব ফাংশন দিয়ে আমরা কিবোর্ড থেকে ইনপুট নিই। এখন printf ফাংশনটি যে আমরা লিখলাম, কম্পিউটারের তো আর এটি বোঝার কথা নয়। printf ফাংশনটি কী কাজ করবে, কীভাবে করবে সেটি আসলে বলে দেওয়া আছে stdio.h নামের একটি হেডার (header) ফাইলের মধ্যে। এজন্যই আমরা আমাদের প্রোগ্রামগুলোতে (যেখানে printf, scanf ইত্যাদি ব্যবহার করেছি) ওই হেডার ফাইলটির কথা বলে দিই (#include <stdio.h>)। আবার স্ট্রিং-সংক্রান্ত ফাংশনগুলো ব্যবহার করলে string.h – এই হেডার ফাইলটির কথাও বলে দিই। এখন চিন্তা করো, printf ফাংশনের এই কোডটি যদি আমাদের নিজেদের লিখতে হতো, তাহলে ব্যাপারটি কী বিরক্তিকরই না হতো! এরকম অনেক ফাংশন আছে যেগুলোর ব্যবহার তোমরা আস্তে আস্তে জেনে যাবে।<br>\n" +
                        "<br>\n" +
                        "আচ্ছা, main কে ও তো আমি একটি ফাংশন বলেছি, কিন্তু এটি দিয়ে আমরা আবার কী করি? সি ল্যাঙ্গুয়েজে এই ফাংশনটি দিয়েই আসলে আমরা একটি প্রোগ্রাম চালাই। কম্পাইলার জানে যে main ফাংশন যেখানে আছে, সেখান থেকেই কাজ শুরু করতে হবে। তাই একটি প্রোগ্রামে কেবল একটিই main ফাংশন থাকে।<br>\n" +
                        "<br>\n" +
                        "এবারে দেখি, আমরা নিজেরা কীভাবে ফাংশন তৈরি করতে পারি। একটি ফাংশন যখন আমরা তৈরি করব সেটির গঠন হবে মোটামুটি এই রকম:<br>\n" +
                        "<br>\n" +
                        "return_type function_name (parameters) {<br>\n" +
                        "function_body<br>\n" +
                        "return value<br>\n" +
                        "}<br>\n" +
                        "<br>\n" +
                        "return_type: এখানে বলে দিতে হবে ফাংশনটি কাজ শেষ করে বের হবার সময় কী ধরনের ডাটা রিটার্ন করবে। সেটি, int, double এসব হতে পারে। আবার কিছু রিটার্ন করতে না চাইলে সেটি void হতে পারে। অর্থাৎ সে কিছুই রিটার্ন করবে না। এর মানে দাঁড়াচ্ছে, তুমি আসলে ফাংশনকে দিয়ে কোনো একটি কাজ করাবে, সেজন্য কাজ শেষে সে তোমাকে কী ধরনের ডাটা ফেরত দেবে সেটি বলে দিতে হবে। ফাংশনের কোনো জায়গাতে তুমি যখনই return ব্যবহার করবে, ফাংশনটি সেই জায়গা থেকেই রিটার্ন করবে বা বের হয়ে যাবে। অনেক ফাংশনের ভেতর দেখবে একাধিক রিটার্ন আছে এবং সঙ্গে বিভিন্ন শর্ত দেওয়া আছে। শর্তের উপর নির্ভর করে যখনই প্রোগ্রামটি কোনো রিটার্ন পাবে তখনই ফাংশন থেকে বের হয়ে যাবে।<br>\n" +
                        "<br>\n" +
                        "function_name: এখানে আমাদের ফাংশনের নাম লিখতে হবে। ফাংশনের নাম হতে হবে অর্থপূর্ণ যাতে নাম দেখেই ধারনা করা যায় যে ফাংশনটি কী কাজ করবে। যেমন কোন সংখ্যার বর্গমূল নির্ণয়ের জন্য যদি আমরা একটি ফাংশন লিখি তবে সেটির নাম আমরা দিতে পারি square_root বা sqrt। আমরা নিশ্চয়ই সেটির নাম beautiful দিব না, যদিও কম্পাইলার তাতে কোন আপত্তি করবে না।<br>\n" +
                        "<br>\n" +
                        "parameters: এখানে ফাংশনটি কাজ করার জন্য প্রয়োজনীয় ডাটা আমরা দেব। যেমন স্ট্রিং-এর দৈর্ঘ্য নির্ণয়ের জন্য আমরা যখন strlen ফাংশনটি ব্যবহার করি সেখানে কোন স্ট্রিং-এর দৈর্ঘ্য নির্ণয় করতে হবে সেটি বলে দিতে হয় (নইলে সেটি কার দৈর্ঘ্য নির্ণয় করবে?)। আবার বর্গমূল নির্ণয়ের জন্য ফাংশন লিখলে কোন সংখ্যার বর্গমূল বের করতে হবে সেটি বলে দিতে হবে। প্যারামিটারের মাধ্যমে আমরা সেসব ডাটা ওই ফাংশনের কাছ পাঠাতে পারি। আবার কোনো কিছু পাঠাতে না চাইলে সেটি খালিও রাখতে পারি। যেমন, getchar() বা main() ফাংশন। একাধিক প্যারামিটার পাঠানোর সময় প্রতিটি প্যারামিটার কমা (,) দিয়ে আলাদা করতে হবে।<br>\n" +
                        "<br>\n" +
                        "function_body: ফাংশনটি কীভাবে কী কাজ করবে সেটি বডিতে বলে দিতে হবে। মানে কোড লিখতে হবে আর কি। <br>\n" +
                        "<br>\n" +
                        "return value: ফাংশনটি কাজ শেষ করে, তাকে যে জায়গা থেকে কল করা হয়েছে সে জায়গায় ফিরে যায়। ফেরার সময় আমরা কোনো মান পাঠাতে পারি। যেমন sqrt() ফাংশনে আমরা চাই সে বর্গমূল বের করবে। তো বর্গমূলটি বের করে তো সেটি ফেরত পাঠাবার ব্যবস্থা রাখতে হবে? বর্গমূলটির মান যদি x হয়, তবে আমরা return x; স্টেটমেন্ট দিয়ে সেটির মান ফেরত পাঠাব।<br>\n" +
                        "<br>\n" +
                        "int root = sqrt(25);<br>\n" +
                        "<br>\n" +
                        "এখানে sqrt ফাংশন 25-এর বর্গমূল নির্ণয় করার পর বর্গমূলটি ফেরত পাঠাবে এবং সেটি root নামের একটি ইন্টিজার ভেরিয়েবলে জমা হবে।<br>\n" +
                        "<br>\n" +
                        "একটি উদাহরণ দিই। তোমরা যারা ত্রিকোণমিতি পড়েছ তারা নিশ্চয়ই sin, cos, tan ইত্যাদির সঙ্গে পরিচিত। sin 300-এর মান হচ্ছে 0.5। এখানে sin কিন্তু আসলে একটি ফাংশন, যার প্যারামিটার হিসেবে আমরা কোণের মান দিচ্ছি। আর ফাংশনটি ওই কোণের sine (সংক্ষেপে sin)-এর মান রিটার্ন করছে।<br>\n" +
                        "<br>\n" +
                        "এবারে চলো, আর বকবক না করে প্রোগ্রামিং শুরু করে দিই। তারপর দেখি কী করলে কী হয়।<br>\n" +
                        "<br>\n" +
                        "</stdio.h></div><pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     double a, b, c;  \n" +
                        "     a = 2.5;  \n" +
                        "     b = 2.5;  \n" +
                        "     c = a + b;  \n" +
                        "     printf(\"%lf\\n\" c);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৭.১  \n" +
                        "</code></pre><br>\n" +
                        "প্রোগ্রামটি চালাও। আউটপুট কী? 5.000000।<br>\n" +
                        "<br>\n" +
                        "এবার আমরা দুটি সংখ্যা যোগ করার জন্য একটি ফাংশন লিখে ফেলি। যোগের কাজটি আর main ফাংশনের ভেতরে করব না।<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int add(int num1, int num2)   \n" +
                        " {  \n" +
                        "     double sum = num1 + num2;  \n" +
                        "     return sum;  \n" +
                        " }  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     double a, b, c;  \n" +
                        "     a = b = 2.5;  \n" +
                        "     c = add(a, b);  \n" +
                        "     printf(\"%lf\\n\", c);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৭.২  \n" +
                        "</code></pre><br>\n" +
                        "প্রোগ্রামটি চালাও। আউটপুট কী? 4.000000! ওহ\u200D্\u200D আমরা তো গাধার মতো একটি ভুল করেছি। num1 ও num2 তো আসলে int টাইপের হবে না, double টাইপের হবে। ওই দুটি ভেরিয়েবল ইন্টিজার হিসেবে ডিক্লেয়ার করার কারণে 2.5 হয়ে গিয়েছে  2 (টাইপ কাস্টিংয়ের কথা মনে আছে তো?)। আমরা ভুল ঠিক করে ফেলি:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> int add(double num1, double num2)   \n" +
                        " {  \n" +
                        "     double sum = num1 + num2;  \n" +
                        "     return sum;  \n" +
                        " }  \n" +
                        "</code></pre><br>\n" +
                        "এবারে প্রোগ্রামটি রান করলে আউটপুট কী? 5.000000। যাক, সমস্যার সমাধান হয়ে গেল! আচ্ছা, এবারে আমরা a, b-এর মান একটু বদলাই। a = 2.8; b = 2.7; করে দিই। আউটপুট কত হবে? 5.500000? এটিই হওয়া উচিত (2.8 + 2.7 = 5.5) কিন্তু প্রোগ্রামটি রান করে দেখো তো কত হয়? তুমি আউটপুট পাবে 5.000000। কারণ কী?<br>\n" +
                        "<br>\n" +
                        "কারণ, আমাদের ফাংশনের রিটার্ন টাইপ int, যা কিনা একটি ইন্টিজার রিটার্ন করতে সক্ষম। num1 ও num2 যোগ করার পর sum-এর মধ্যে 5.5 ঠিকই থাকবে কিন্তু রিটার্ন করার সময় সেটি ইন্টিজারে বদলে যাবে। সুতরাং রিটার্ন টাইপ আমরা double করে দেব। এবার আমাদের প্রোগ্রাম ঠিকঠাক কাজ করবে:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " double add(double n1, double n2)   \n" +
                        " {   \n" +
                        "     double sum = n1 + n2;   \n" +
                        "     return sum;   \n" +
                        " }   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     double a, b, c;   \n" +
                        "     a = 2.8;   \n" +
                        "     b = 2.7;   \n" +
                        "     c = add(a, b);   \n" +
                        "     printf(\"%lf\\n\", c);   \n" +
                        "     return 0;   \n" +
                        " }   \n" +
                        " প্রোগ্রাম: ৭.৩  \n" +
                        "</code></pre><br>\n" +
                        "এখন আমরা একটি এক্সপেরিমেন্ট করব। add ফাংশনটি main ফাংশনের পরে লিখব:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     double a = 2.8, b = 2.7, c;   \n" +
                        "     c = add(a, b);   \n" +
                        "     printf(\"%lf\\n\", c);   \n" +
                        "     return 0;   \n" +
                        " }   \n" +
                        " double add(double n1, double n2)   \n" +
                        " {   \n" +
                        "     double sum = n1 + n2;   \n" +
                        "     return sum;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৭.৪  \n" +
                        "</code></pre><br>\n" +
                        "এবারে প্রোগ্রামটি রান করতে গেলে দেখবে, কম্পাইলার এরর দিচ্ছে: \"error: ‘add’ was not declared in this scope\", অর্থাৎ সে আর add ফাংশনটিকে চিনতে পারছে না। তবে চিন্তা নেই, এটিকে চিনিয়ে দেওয়ার ব্যবস্থাও আছে। সেটি হচ্ছে main ফাংশনের আগে add ফাংশনের প্রোটোটাইপ (prototype) বলে দেওয়া:<br>\n" +
                        "<br>\n" +
                        "double add(double n1, double n2);<br>\n" +
                        "<br>\n" +
                        "প্রোটোটাইপে পুরা ফাংশনটি লিখতে হয় না। এর অংশগুলো হচ্ছে:<br>\n" +
                        "<br>\n" +
                        "return_type function_name (parameters) ;<br>\n" +
                        "<br>\n" +
                        "সেমিকোলন দিতে ভুল করবে না কিন্তু। আর প্রোটোটাইপের প্যারামিটারে যে ভেরিয়েবল ব্যবহার করবে তার সঙ্গে মূল ফাংশনের ভেরিয়েবলের নাম একরকম না হলে কোনো অসুবিধা নেই, তবে ডাটা টাইপ একই হতে হবে। এখন নিচের প্রোগ্রামটি ঠিকঠাক কাজ করবে:<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;   \n" +
                        " double add(double x, double y);   \n" +
                        " int main()   \n" +
                        " {   \n" +
                        "     double a = 2.8, b = 2.7, c;   \n" +
                        "     c = add(a, b);   \n" +
                        "     printf(\"%lf\\n\", c);   \n" +
                        "     return 0;   \n" +
                        " }   \n" +
                        " double add(double n1, double n2)   \n" +
                        " {   \n" +
                        "     double sum = n1 + n2;   \n" +
                        "     return sum;   \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৭.৫  \n" +
                        "</code></pre><br>\n" +
                        "এবার আমরা আরও কিছু পরীক্ষা-নিরীক্ষা করব।<br>\n" +
                        "<br>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int test_function(int x)   \n" +
                        " {  \n" +
                        "     int y = x;  \n" +
                        "     x = 2 * y;  \n" +
                        "     return (x * y);  \n" +
                        " }  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int x = 10, y = 20, z = 30;  \n" +
                        "     z = test_function(x);  \n" +
                        "     printf(\"%d %d %d\\n\", x, y, z);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৭.৬  \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\"> প্রোগ্রামটি না চালিয়ে শুধু কোড দেখে বলো তো আউটপুট কী হবে? আমাদের কোনো তাড়া নেই, তাই ধীরেসুস্থে চিন্তা করে বলো।<br>\n" +
                        "<br>\n" +
                        "এবার কে কে আমার সঙ্গে একমত যে আউটপুট হবে:<br>\n" +
                        "20 10 200 (অর্থাৎ x = 20, y = 10, z = 200)?<br>\n" +
                        "<br>\n" +
                        "কারণ x, y-এর মান তো test_function-এর ভেতরে আমরা বদলে দিয়েছি। প্রথমে x-এর মান 10 যাচ্ছে প্যারামিটার হিসেবে, তারপরে সেই মানটি আমরা y-তে বসাচ্ছি। মানে y-এর মান এখন 10। তারপর x-এর মান বসাচ্ছি 2 * y মানে 20। তারপর রিটার্ন করছি x * y (যার মান, 20 * 10 বা 200)। সুতরাং z-এর মান হবে 200। <br>\n" +
                        "<br>\n" +
                        "এবারে প্রোগ্রামটি চালাও, আউটপুট দেখবে: 10 20 200 (অর্থাৎ x = 10, y = 20, z = 200)। এমন হওয়ার কারণ কী? z-এর মান নিয়ে কোনো আপত্তি নেই, ফাংশনটি 200 রিটার্ন করে আর সেটি আমরা z-এ বসিয়ে দিয়েছি। কথা হচ্ছে, x আর y-এর মান নিয়ে। আসলে test_function-এর ভেতরে আমরা x, y-এর মান পরিবর্তন করায় main ফাংশনের x, y-এর কিছু আসে-যায় না। প্রত্যেক ফাংশনের ভেরিয়েবলগুলো আলাদা। একে বলে লোকাল ভেরিয়েবল (local variable)। আমরা main ফাংশনের x, y-এর মান প্রিন্ট করেছি test_function ফাংশনের x, y-এর মান প্রিন্ট করিনি। এক ফাংশনের লোকাল ভেরিয়েবলের অস্তিত্ব অন্য ফাংশনে থাকে না। তুমি এখন কিছু প্রোগ্রাম লিখে আরও পরীক্ষা-নিরীক্ষা করে দেখতে পারো। কী প্রোগ্রাম লিখবে সেটি তোমার ওপর ছেড়ে দিলাম।<br>\n" +
                        "<br>\n" +
                        "আমরা যদি চাই, কোনো ভেরিয়েবলের অস্তিত্ব আমাদের প্রোগ্রামের সব ফাংশনের ভেতরে থাকতে হবে, তবে আমরা সেটি করতে পারি গ্লোবাল (global) ভেরিয়েবল ডিক্লেয়ার করার মাধ্যমে। আমরা প্রোগ্রামের শুরুতে কোনো ফাংশন বা ফাংশনের প্রোটোটাইপ লিখার আগে সেগুলো ডিক্লেয়ার করে দেব। যেমন:</div><br>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " double pi = 3.14;  \n" +
                        " void my_fnc() {  \n" +
                        "     pi = 3.1416; /* এখানে আমরা pi-এর মান একটু পরিবর্তন করে দিলাম */  \n" +
                        "     return; /* ফাংশনের রিটার্ন টাইপ void হলে এই return; না দিলেও কিন্তু চলে */  \n" +
                        " }  \n" +
                        " int main() {  \n" +
                        "     printf(\"%lf\\n\", pi); /* এখানে pi-এর মান হবে 3.14 */  \n" +
                        "     my_fnc();  \n" +
                        "     printf(\"%lf\\n\", pi); /* এখানে pi-এর মান হবে 3.1416 কারণ আমরা সেটি my_fnc ফাংশনে গিয়ে বদলে দিয়েছি। */  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\"> আবার আমরা যদি my_fnc ফাংশনের ভেতরে গিয়ে pi নামে একটি ভেরিয়েবল ডিক্লেয়ার করতাম (double pi;), তবে সেটি একটি লোকাল ভেরিয়েবল হতো এবং গ্লোবাল pi-এর মানের কোন পরিবর্তন হতো না।<br>\n" +
                        "<br>\n" +
                        "এতক্ষণ আমরা ফাংশনের প্যারামিটার হিসেবে কেবল ভেরিয়েবল ব্যবহার করেছি। এবারে আসো আমরা ফাংশনের প্যারামিটার হিসেবে অ্যারে পাঠাই। আমরা একটি প্রোগ্রাম লিখব যেটি কোনো একটি ইন্টিজার অ্যারে থেকে সবচেয়ে বড় সংখ্যাটি খুঁজে বের করবে। অ্যারে থেকে সর্বোচ্চ সংখ্যা খুঁজে বের করার কাজটি করার জন্য একটি ফাংশন লিখে ফেলি, কী বলো?<br>\n" +
                        "<br>\n" +
                        "int find_max(int ara[], int n) { /* এখানে আমরা দুটি প্যারামিটার দিচ্ছি। প্রথমটা হচ্ছে একটি অ্যারে, আর তারপর একটি সংখ্যা যেটি নির্দেশ করবে অ্যারেতে কয়টি সংখ্যা আছে। লক্ষ করো, প্যারামিটারে যখন অ্যারের কথাটি বলে দিচ্ছি তখন সেখানে কয়টি উপাদান আছে সেটি না দিলেও চলে, যেমন আমরা int ara[11] ও লিখতে পারতাম। */<br>\n" +
                        "<br>\n" +
                        "int max = ara[0]; /*  এখানে একটি ভেরিয়েবলে ধরে নিচ্ছি যে সবচেয়ে বড় সংখ্যাটি হচ্ছে অ্যারের প্রথম সংখ্যা। তারপরে আমরা অ্যারের বাকি উপাদানগুলোর সঙ্গে maxকে তুলনা করব আর যদি অ্যারের কোনো উপাদানের মান max-এর চেয়ে বড় হয় তখন সেই মানটি max-এ রেখে দেব। অর্থাৎ তখন আবার max হয়ে যাবে ওই অ্যারের সর্বোচ্চ সংখ্যা। */<br>\n" +
                        "<br>\n" +
                        "int i;<br>\n" +
                        "for(i = 1; i &lt; n; i++) {         if (ara[i] &gt; max) {<br>\n" +
                        "max = ara[i]; /* ara[i] যদি max-এর চেয়ে বড় হয় তবে max-এ ara[i]-এর মানটি অ্যাসাইন করে দিচ্ছি। */<br>\n" +
                        "}<br>\n" +
                        "}<br>\n" +
                        "return max; /* ফাংশন থেকে সর্বোচ্চ মানটি ফেরত পাঠাচ্ছি */<br>\n" +
                        "}<br>\n" +
                        "<br>\n" +
                        "এখন কথা হচ্ছে এই ফাংশনকে আমরা কল করব কীভাবে? ভেরিয়েবলের জায়গায় তো এর নাম দিয়ে কল করতে হয়, কিন্তু অ্যারের বেলায় কী দেব? অ্যারের বেলাতেও শুধু নাম দিলেই চলবে। পুরো প্রোগ্রামটি এবারে রান করে দেখো:</div><br>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " int find_max(int ara[], int n);  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int ara[] = {-100, 0, 53, 22, 83, 23, 89, -132, 201, 3, 85};  \n" +
                        "     int n = 11;  \n" +
                        "     int max = find_max(ara, n);  \n" +
                        "     printf(\"%d\\n\", max);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " int find_max(int ara[], int n)   \n" +
                        " {  \n" +
                        "     int max = ara[0];  \n" +
                        "     int i;  \n" +
                        "     for(i = 1; i &lt; n; i++) {  \n" +
                        "         if (ara[i] &gt; max) {  \n" +
                        "             max = ara[i];  \n" +
                        "         }  \n" +
                        "     }  \n" +
                        "     return max;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৭.৭  \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\"> এখন তোমরা find_min নামে আরেকটি ফাংশন লেখো যার কাজ হবে সবচেয়ে ছোট সংখ্যাটি খুঁজে বের করা। find_sum, find_average এসব ফাংশনও লিখে ফেলতে পারো। আর তোমাদের নিশ্চয়ই বলে দিতে হবে না এইসব ফাংশন কী কাজ করবে।<br>\n" +
                        "<br>\n" +
                        "ফাংশনে ভেরিয়েবল পাস করা (pass, পাঠানো অর্থে) আর অ্যারে পাস করার মধ্যে একটি গুরুত্বপূর্ণ পার্থক্য রয়েছে। আমরা ইতিমধ্যে দেখেছি যে ফাংশনের ভেতর ভেরিয়েবল পাস করলে ওই ফাংশনের ভেতরে সেটির আরেকটি কপি তৈরি হয়, সুতরাং সেখানে ওই ভেরিয়েবলের মান পরিবর্তন করলে মূল ফাংশন (যেখান থেকে ফাংশন কল করা হয়েছে) ভেরিয়েবলের মানের কোনো পরিবর্তন হয় না। তবে অ্যারের বেলায় ব্যাপারটি আলাদা। আগে আমরা একটি প্রোগ্রাম লিখে দেখি:</div><br>\n" +
                        "<pre style=\"background: none repeat scroll 0% 0% rgb(240, 240, 240); border: 1px dashed rgb(204, 204, 204); color: black; font-family: arial; font-size: 12px; height: auto; line-height: 20px; overflow: auto; padding: 0px; width: 99%;\"><code style=\"color: black; word-wrap: normal;\"> #include &lt;stdio.h&gt;  \n" +
                        " void test_function(int ara[])   \n" +
                        " {  \n" +
                        "     ara[0] = 100;  \n" +
                        "     return;  \n" +
                        " }  \n" +
                        " int main()   \n" +
                        " {  \n" +
                        "     int ara [] = {1, 2, 3, 4, 5};  \n" +
                        "     printf(\"%d\\n\", ara[0]);  \n" +
                        "     test_function(ara);  \n" +
                        "     printf(\"%d\\n\", ara[0]);  \n" +
                        "     return 0;  \n" +
                        " }  \n" +
                        " প্রোগ্রাম: ৭.৮  \n" +
                        "</code></pre><br>\n" +
                        "<div style=\"text-align: justify;\"> এই প্রোগ্রামের আউটপুট কী হবে? প্রথম printf ফাংশনটি 1 প্রিন্ট করবে সেটি নিয়ে তো কোনো সন্দেহ নেই, কিন্তু দ্বিতীয় printf কী প্রিন্ট করবে? test_function-এর ভেতর আমরা অ্যারের প্রথম উপাদানের মান 100 অ্যাসাইন করেছি। এখন যদি সেটি মূল অ্যারেকে পরিবর্তন করে, তবে ara[0]-এর মান হবে 100, আর পরিবর্তন না হলে মান হবে আগে যা ছিল তা-ই, মানে 1।<br>\n" +
                        "<br>\n" +
                        "আমরা আউটপুট দেখব 100, কারণ অ্যারেটির প্রথম উপাদানের মান পরিবর্তিত হয়েছে। অর্থাৎ আমরা বুঝতে পারলাম ফাংশনের ভেতরে অ্যারে পাস করলে ওই অ্যারের আলাদা কোনো কপি তৈরি হয় না। কারণ হচ্ছে আমরা ফাংশনের ভেতর অ্যারের নামটি কেবল পাঠাই, যেটি কিনা ওই অ্যারেটি মেমোরির কোন জায়গায় আছে তার অ্যাড্রেস। এখন তোমরা বৃত্তের ক্ষেত্রফল নির্ণয়ের জন্য একটি ফাংশন লিখে ফেলো। ক্ষেত্রফল বের করার সূত্রটি মনে আছে তো? মনে না থাকলে জ্যামিতি বই থেকে দেখে নাও।</div><div style=\"text-align: justify;\"></div></div>\n" +
                        "<div style=\"clear: both;\"></div>\n" +
                        "</div>\n" +
                        "</div>\n" +
                        "</body>\n" +
                        "</html>",
                new HtmlResImageGetter(htmlTextView));

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
