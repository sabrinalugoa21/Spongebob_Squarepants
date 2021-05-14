#ifndef BACKENDMODE_H_
#define BACKENDMODE_H_

enum class BackendMode
{
    CONVERTER, EXECUTOR, COMPILER
};

constexpr BackendMode CONVERTER = BackendMode::CONVERTER;
constexpr BackendMode EXECUTOR  = BackendMode::EXECUTOR;
constexpr BackendMode COMPILER  = BackendMode::COMPILER;

#endif /* BACKENDMODE_H_ */
