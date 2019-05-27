#pragma once

#include "hello_world.hpp"

namespace hellofromcpp {

    class HelloWorldImpl : public hellofromcpp::HelloWorld {

    public:

        // Constructor
        HelloWorldImpl();

        // Our method that returns a string
        std::string get_hello_world();

    };

}