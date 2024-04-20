
Feature: Testing tags and hooks

#Scenario: I want to login
#Given I want login in my application

@FunctionalTest
Scenario: I want to generate one lead
Given Generating leads

@SmokeTest
Scenario: I want to connect to DB
Given Connecting DataBase

@SmokeTest @FunctionalTest
Scenario: I want to disconnect DB
Given Disconnecting DB


#Scenario: I want to logout
#Given Logout from system