# Urban Transport Pass System – Group Project

This project implements an object-oriented Java system to manage urban transport passes (bus, metro, bike-share). It demonstrates abstraction, inheritance for shared pass behaviour, and composition for attaching usage rules and logging trips.

---

## UsagePolicy Class

The UsagePolicy class defines the rules under which a transport pass can be used.

It contains peakHours, zones, and limits fields. ArrayLists are used for peakHours and zones to support multiple values.

The constructor initialises all fields. Getter and setter methods are provided to allow controlled access and modification of policy data.

## UsageLog Class

The UsageLog class is responsible for recording pass usage.

It uses an ArrayList to store usage records, as the number of records can grow dynamically.

The log() method stores a single usage record, including pass ID, transport type, fare, and date.

The printAll() method outputs all recorded usage entries.

## PassManager Class

The PassManager class handles validation and renewal operations.

The validate() method checks whether a pass is still valid by comparing the current date with the pass’s validUntil field.

The renew() method extends the validity period of a pass by adding a specified number of days.

## TransportPass Class

The TransportPass class represents a generic transport pass and acts as an abstract base class.

It contains passID, ownerName, validUntil, along with a constructor and getter and setter methods.

An abstract calculateFare() method is defined, requiring all subclasses to provide their own fare calculation logic.

## BusPass, MetroPass, and BikeSharePass Classes

These classes extend TransportPass and represent specific transport modes.

Each subclass overrides the calculateFare() method to define a fixed fare amount for that transport type.

The overridden methods both print and return the calculated fare, demonstrating polymorphism and shared structure with customised behaviour.

## Main Class

The Main class is used to demonstrate and test system functionality.

It creates instances of each transport pass, calls their calculateFare() methods to demonstrate overriding, validates and renews passes using the PassManager, and records usage through the UsageLog.
