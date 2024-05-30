## Exercise 4: Unfair Advertisement

### About this exercise
In this exercise, a pre-written Java code is provided, which displays a visualization used for marketing an imaginary internet company. 
This bar chart illustrates the internet speed for each company, showing the differences compared to their competitors. 
However, the comparison seems incorrectly and highly significant.

The goal of this exercise is to modify the application file so that the visualization is more readable and the comparison is fairer.

### Approach
#### Here is the original bar chart.
<img src="https://github.com/chanronnie/Java_Programming_MOOC_Helsinki/blob/main/Part%2014/1.%20Data%20visualization/Part14_04.UnfairAdvertisement/BarChart_Before.png">

Note that the comparison of internet speed is not quite accurate with this visualization. 
By just looking at the bar chart above, we might wrongly conclude that there is a significantly high difference in internet speed among the companies. 
In truth, there is only a maximum difference of 0.3 units. This is due to the omission of labeling the y-axis units.

#### Here is the updated bar chart
<img src="https://github.com/chanronnie/Java_Programming_MOOC_Helsinki/blob/main/Part%2014/1.%20Data%20visualization/Part14_04.UnfairAdvertisement/BarChart_After.png">

With this updated bar chart, the comparison of internet speed is more accurate. 
By setting `setTickLabelsVisible` to `true` on the y-axis, we can achieve a more readable visualization.

```java
yAxis.setTickLabelsVisible(true);
```

### Files Content
- [UnfairAdvertisementApplication.java](UnfairAdvertisementApplication.java): This file contains my code for displaying the updated bar chart.
- [BarChart_After.png](BarChart_After.png): This image shows the original bar chart.
- [BarChart_Before.png](BarChart_Before.png): This image shows the updated bar chart with a more comprehensive comparison. 
