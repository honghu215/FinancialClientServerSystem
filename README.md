# FinancialClientServerSystem
A system based on financial analyzing binomial module 

### Group members: Yefei Lu, Hong Hu

1. **Project description**:  
  Build a client-server application to support a simplified model of a financial risk management
system. The mathematical finance will be adapted from lectures taught in the CS765 course.

1. **Motivation**: 
  The application is intended to exhibit online trading of financial securities, and real time calculation of some financial risk metrics. It provides an opportunity to study such things as Amazon Web Services Cloud (AWS) and Amazon Relational Database Service (RDS), for example.  
  
1. **Client**: 
  * Display portfolio of instruments bought/sold by the trader (from simulated stock market)).
  * Request calculations of risk metrics of selected rows or entire portfolio.

1. **Server**:
  * will be deployed on AWS, make it a live server  
  * Respond to client requests to calculate fair value and risk parameters.
  * Financial mathematical computations will implement algorithms taught in the CS765 course.

1. **Database**:  
  * Login information for trader accounts.
  * Contents of trading portfolio (name of security, quantity bought/sold, price, etc.)
  * Record of trades performed by each trader.
  * Simulated databas of “stock market” of available securities to trade.

1. **Security**:  
  * Clients’ password and foget account, password resetting.
  * Admins’ management authority. 
  * Disable public access to cloud database. 
  * Email verification.  

* Software to be used (partial list)
  * InteliJ IDEA
  * Github: https://github.com/honghu215/FinancialClientServerSystem.git

