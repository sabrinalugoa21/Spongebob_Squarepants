################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../intermediate/symbtab/Predefined.cpp 

OBJS += \
./intermediate/symbtab/Predefined.o 

CPP_DEPS += \
./intermediate/symbtab/Predefined.d 


# Each subdirectory must supply rules for building sources it contributes
intermediate/symbtab/%.o: ../intermediate/symbtab/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -std=c++0x -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


