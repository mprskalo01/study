useState

    Explanation: This hook allows you to add state to functional components. It returns an array containing the current state value and a function to update it.
    Use Case: When you need to manage local component state, such as form inputs or toggling UI elements.

```jsx

import React, { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  return (
    <div>
      <p>You clicked {count} times</p>
      <button onClick={() => setCount(count + 1)}>
        Click me
      </button>
    </div>
  );
}
```
useEffect

    Explanation: This hook lets you perform side effects in function components. It runs after the render and can optionally clean up after itself.
    Use Case: When you need to fetch data, set up subscriptions, or manually change the DOM.

```jsx

import React, { useState, useEffect } from 'react';

function DataFetcher() {
  const [data, setData] = useState(null);

  useEffect(() => {
    fetch('https://api.example.com/data')
      .then(response => response.json())
      .then(data => setData(data));
  }, []);

  return <div>{data ? `Data: ${data}` : 'Loading...'}</div>;
}
```
useContext

    Explanation: This hook allows you to use context to pass data through the component tree without manually passing props at every level.
    Use Case: When you need to access global data like themes, user information, or settings.

```jsx

import React, { useContext } from 'react';

const ThemeContext = React.createContext('light');

function ThemedComponent() {
  const theme = useContext(ThemeContext);
  return <div className={`theme-${theme}`}>Current theme: {theme}</div>;
}
```
useReducer

    Explanation: This hook is used for state management when the state logic is complex or involves multiple sub-values.
    Use Case: When you need to manage complex state logic, such as in a form with multiple inputs or a complex UI component.

```jsx

import React, { useReducer } from 'react';

const initialState = { count: 0 };

function reducer(state, action) {
  switch (action.type) {
    case 'increment':
      return { count: state.count + 1 };
    case 'decrement':
      return { count: state.count - 1 };
    default:
      throw new Error();
  }
}

function Counter() {
  const [state, dispatch] = useReducer(reducer, initialState);
  return (
    <div>
      <p>Count: {state.count}</p>
      <button onClick={() => dispatch({ type: 'increment' })}>+</button>
      <button onClick={() => dispatch({ type: 'decrement' })}>-</button>
    </div>
  );
}
```
useCallback

    Explanation: This hook returns a memoized callback function, which helps to prevent unnecessary re-renders.
    Use Case: When you need to pass a callback to a child component and want to prevent the child from re-rendering unnecessarily.

```jsx

import React, { useState, useCallback } from 'react';

function Parent() {
  const [count, setCount] = useState(0);
  const handleClick = useCallback(() => {
    setCount(count + 1);
  }, [count]);

  return <Child onClick={handleClick} />;
}

function Child({ onClick }) {
  return <button onClick={onClick}>Click me</button>;
}
```
useMemo

    Explanation: This hook returns a memoized value, which can help optimize performance by avoiding expensive calculations on every render.
    Use Case: When you have a computationally expensive calculation that you don’t want to repeat on every render.

```jsx

import React, { useState, useMemo } from 'react';

function ExpensiveComponent({ num }) {
  const computeExpensiveValue = (num) => {
    // Assume this calculation is expensive
    return num * 2;
  };

  const memoizedValue = useMemo(() => computeExpensiveValue(num), [num]);

  return <div>Computed value: {memoizedValue}</div>;
}
```
useRef

    Explanation: This hook allows you to persist values across renders and directly interact with DOM elements.
    Use Case: When you need to access a DOM element directly or store a mutable value that does not trigger a re-render when updated.

```jsx

import React, { useRef } from 'react';

function FocusInput() {
  const inputRef = useRef(null);

  const focusInput = () => {
    inputRef.current.focus();
  };

  return (
    <div>
      <input ref={inputRef} type="text" />
      <button onClick={focusInput}>Focus Input</button>
    </div>
  );
}
```
useLayoutEffect

    Explanation: This hook runs synchronously after all DOM mutations. It is similar to useEffect, but it fires synchronously.
    Use Case: When you need to read layout information and synchronously re-render. This is useful for animations or getting measurements from the DOM.

```jsx

import React, { useLayoutEffect, useRef } from 'react';

function LayoutComponent() {
  const divRef = useRef(null);

  useLayoutEffect(() => {
    console.log('div dimensions:', divRef.current.getBoundingClientRect());
  }, []);

  return <div ref={divRef}>LayoutEffect Example</div>;
}
```
useImperativeHandle

    Explanation: This hook customizes the instance value that is exposed when using ref in parent components. It allows you to expose only specific properties and methods to the parent component.
    Use Case: When you need to expose a custom API from a child component to a parent component.

```jsx

import React, { useImperativeHandle, forwardRef, useRef } from 'react';

const CustomInput = forwardRef((props, ref) => {
  const inputRef = useRef();

  useImperativeHandle(ref, () => ({
    focus: () => {
      inputRef.current.focus();
    },
    getValue: () => {
      return inputRef.current.value;
    }
  }));

  return <input ref={inputRef} type="text" />;
});

function Parent() {
  const inputRef = useRef();

  const handleClick = () => {
    inputRef.current.focus();
    console.log(inputRef.current.getValue());
  };

  return (
    <div>
      <CustomInput ref={inputRef} />
      <button onClick={handleClick}>Focus and Get Value</button>
    </div>
  );
}
```
useDebugValue

    Explanation: This hook allows you to display a label for custom hooks in React DevTools for better debugging.
    Use Case: When you create a custom hook and want to improve its readability and debugging experience in React DevTools.

```jsx

    import React, { useState, useDebugValue } from 'react';

    function useFriendStatus(friendID) {
      const [isOnline, setIsOnline] = useState(null);

      useDebugValue(isOnline ? 'Online' : 'Offline');

      // Imagine some logic here to determine if the friend is online
      return isOnline;
    }

    function FriendComponent({ friendID }) {
      const isOnline = useFriendStatus(friendID);

      return <div>{isOnline ? 'Online' : 'Offline'}</div>;
    }
```
These hooks provide a robust set of tools for managing state, side effects, context, and more in your functional components. Each hook has its own use cases and advantages, making React development more efficient and organized.