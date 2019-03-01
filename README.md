# ChoreChart

Chore (Object)
•	Public Chore(String chorename, String days, int amountPpl, Boolean isPoop)
    Takes the chorename, the days it needs to be done, the amount of people needed each day, and a boolean stating if it is a freshman.
    Int getMinutes();
    Time it takes to finish a chore.
•	Int getPeopleAmount();
    Amount of people the chore takes.
•	String getDays();
    What days of the week the chores are being done separated by and underscore. For example, if the chore is done on Monday, Wednesday, and Friday, it return “M_W_F”
•	Person [] getPeopleOnDay(String day);
    Returns an array with the people assigned to the chore on the day passed.
•	String getChoreName()
    Returns a string of the chore name
•	String isPoop()
    Returns true is the chore is a poop and false if not
